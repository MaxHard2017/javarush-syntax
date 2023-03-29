package com.gmail.maxhard001.util.withfiles.filemaint;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ArrayList;
import com.gmail.maxhard001.util.withfiles.vizit.FileContentVizit;

public class Filesearch {
    /**
     * Map<Long, ArrayList<Path>> - содержит список всех длин (key) файлов (List<Path>)
     * для выявления одинаковых по длине файлов, которые теоретически могут быть одинаковыми
     * по содержанию (определяем далее хэшем). Разные по длинам файлы считаем не одинаковыми.
     * Map<String, List<Path>> - дубли по длинам помещаются сюда для вычисления дублей 
     * по хэшам: key - хэш, value - List<Path>
     * @param args[0] - путь к папке с которой начинаем проверку.
     * @param args[1] - путь к файлу в который записывам результаты поиска дублей.
     * 
     */
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();

        //*** args check
        if (args.length < 1) {
            System.out.println("Wrong arguments number! \nExpected directory for search file duplicates and a file path for saving results.");
            return;
        }
        try {
            if( ! Files.exists(Path.of(args[0])) ) {
                sb.append("Wrong path: ").append(args[0]).append(" \nExpected a path for search file duplicates.");
                System.out.println(sb.toString());
                return;
            }
            if( ! (Files.exists(Path.of(args[1]))) ||
                        Objects.isNull(Path.of(args[1]).getFileName()) ) {
                sb.append("Wrong file path/name: ").append(args[1]).append(" \nExpected a path/name for saving results.");
                System.out.println(sb.toString());
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //*** args check

        //*>log
            long startTime = System.currentTimeMillis();
        Path searchPath = Paths.get(args[0]);
        Path searchDublesResul = Path.of(args[1]);

        Map<Long, ArrayList<Path>> fileLengthMap = new HashMap<>(); // длины файлов 
        Map<String, List<Path>> fileHashDublesMap = new HashMap<>(); // хэши и пути всех дублей

        FileContentVizit fv = new FileContentVizit(fileLengthMap, fileHashDublesMap, "CRC32C");
        try {
            Files.walkFileTree(searchPath, fv);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                Writer out = new FileWriter(searchDublesResul.toFile(),
                        false);
        ){
            //*>log
                System.out.println("\n" + "Dubles :" + "\n");
        
            // save data on disk
            out.write("Hash;Path;" + System.getProperty("line.separator")); // Headr

            for (Map.Entry<String, List<Path>> entry : fileHashDublesMap.entrySet()) {
                if (entry.getValue().size() > 1) { // берем только энтри в списке путей которых больше 1 т.е. есть дубли
                    for (Path dublicate : entry.getValue()) {
                        System.out.print(entry.getKey() + "-> " + dublicate.toString() + "\n");
                        out.write(entry.getKey() + ";" + dublicate.toString() + ";" +
                                System.getProperty("line.separator"));
                    }
                }
            }
            out.flush();
            //*>log
                sb = new StringBuilder();
                sb.append("Total work time: ").append((System.currentTimeMillis() - startTime) / 1000).append(" seconds");
                System.out.println(sb.toString());
                out.write(sb.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}