package com.gmail.maxhard001.util.withfiles.vizit;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.gmail.maxhard001.util.withfiles.hash.FileHash;
import static java.nio.file.FileVisitResult.*;


public class FileContentVizit extends SimpleFileVisitor<Path> {
    private Map<String, Path> fileInfo;      // содержит список всех вайлов без дублей
    private Map<String, List<Path>> fileDubles; // содержит пути всех дублей
    public FileContentVizit(Map<String, Path> fileInfo, 
                            Map<String, List<Path>> fileDubles,
                            Path searchDublesResulPath){
        this.fileInfo = fileInfo;
        this.fileDubles = fileDubles;
    }
    
    @Override 
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr){
        
        Path dublFile;                                  // будет содержать путь к дублю файла, если обнаружится
        String key = FileHash.get(file);

            // сохраняем файл в списке всех файлов (он без дублей)
            dublFile = fileInfo.put(key, file);       // выдаст предущий задублированный путь если такой key уже есть. перезаписываем новый путь

            if (dublFile != null){                       // dublFile не null если ключ повторился
                if (fileDubles.containsKey(key)) {         // добавляем путь в список дублированных
                    fileDubles.get(key).add((Path)(file));  // добавляем путь файла в список путей дублей
                } else {
                    fileDubles.put(key, Arrays.asList(file, dublFile));   // добавляем оба пути если это первый дубль
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