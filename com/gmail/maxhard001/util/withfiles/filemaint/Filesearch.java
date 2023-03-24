package com.gmail.maxhard001.util.withfiles.filemaint;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.gmail.maxhard001.util.withfiles.vizit.FileContentVizit;

public class Filesearch {
    public static void main(String[] args) {
        Path searchPath = Paths.get(args[0]);
        Path searchDublesResul = Path.of(args[1]);

        Map<String, Path> allFiles = new HashMap<>();      // содержит список всех вайлов без дублей
        Map<String, List<Path>> fileDubles = new HashMap<>();// искомый список дублей
             

        FileContentVizit fc = new FileContentVizit(allFiles, fileDubles, searchDublesResul);
        try {
            Files.walkFileTree(searchPath, fc);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (
            Writer out = new FileWriter(searchDublesResul.toFile(),
                                             StandardCharsets.UTF_8, false);
        ) {   
            for (Map.Entry<String, List<Path>> entry : fileDubles.entrySet()) {
                for (Path dublicate  : entry.getValue()) {
                    out.write(dublicate.toString() + "\n");
                    System.out.println(dublicate.toString());
                }
            } 
            out.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}