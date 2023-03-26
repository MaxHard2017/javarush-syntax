package com.gmail.maxhard001.util.withfiles.vizit;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.gmail.maxhard001.util.withfiles.hash.FileHash;
import static java.nio.file.FileVisitResult.*;


public class FileContentVizit extends SimpleFileVisitor<Path> {
    private Map<String, Path> fileInfo;      // содержит список всех вайлов без дублей
    private Map<String, ArrayList<Path>> fileDubles; // содержит пути всех дублей
    long i = 0; 
    public FileContentVizit(Map<String, Path> fileInfo, 
                            Map<String, ArrayList<Path>> fileDubles,
                            Path searchDublesResulPath){
        this.fileInfo = fileInfo;
        this.fileDubles = fileDubles;
    }
    
    @Override 
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr){
        
        Path dublFile = null;                                  // будет содержать путь к дублю файла, если обнаружится
        String key = FileHash.get(file);
        System.out.print(i++ +  "...");

            // сохраняем файл в списке всех файлов (он без дублей)
            dublFile = fileInfo.put(key, file);       // выдаст предущий задублированный путь если такой key уже есть. перезаписываем новый путь

            if (dublFile != null){                       // dublFile не null если ключ повторился
                ArrayList<Path> ar;
                if (fileDubles.containsKey(key)) {         // добавляем путь в список дублированных
                    ar = fileDubles.get(key);
                    ar.add((Path)file);  // добавляем путь файла в список путей дублей
                } else {
                    ar = new ArrayList<Path>();
                    ar.add(file);
                    ar.add(dublFile);
                    fileDubles.put(key, ar);         // добавляем оба пути если это первый дубль
                }
            }
        return CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file,IOException exc) {
        System.err.println(exc);
        return CONTINUE;
    }
}