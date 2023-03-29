package com.gmail.maxhard001.util.withfiles.vizit;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.gmail.maxhard001.util.withfiles.hash.FileHash;
import static java.nio.file.FileVisitResult.*;


public class FileContentVizit extends SimpleFileVisitor<Path> {
    private Map<Long, ArrayList<Path>> fileLengthMap;      // содержит список всех вайлов без дублей
    private Map<String, List<Path>> fileHashDublesMap; // содержит пути всех дублей
    private final String ALGORITM;
     
    public FileContentVizit(Map<Long, ArrayList<Path>> fileLengthMap, 
                            Map<String, List<Path>> fileDubles,
                            String algoritm){
        this.fileLengthMap = fileLengthMap;
        this.fileHashDublesMap = fileDubles;
        this.ALGORITM = algoritm;

    }
    
    @Override 
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
        //*>log
            long methodInvocTimeStart = System.currentTimeMillis(); 
        
        ArrayList<Path> dublFile = null; // будет содержать путь к дублю файла, если обнаружится (список путей)
        ArrayList<Path> filePath = new ArrayList<>();

        Long key = attr.size();
        filePath.add(file);             // путь к новому файлу в виде списка с одним значением, так как пути хранятся в виде списка значений
        dublFile = fileLengthMap.put(key, filePath); // выдаст предущий задублированный путь(список путей) если такой key уже есть и перезаписываем на новый путь список с одним новым путем
        
        // log
            System.out.println(file.toString());
            long hashInvocTimeStart = System.currentTimeMillis();
        
        
            if (dublFile != null) { // dublFile не null если ключ повторился - найден файл с таким же размером
                String hash = "";
                Path prevFile = null;

                if (dublFile.size() == 1) { // если дубль первый, считаем хэш для предыдущего, первого входжения, так как для недублированнных вхождения хэш не считается
                    prevFile = dublFile.get(0);
                    hash = FileHash.get(prevFile, ALGORITM);
                    addFileHash(fileHashDublesMap, hash, prevFile); // отправляем предыдущий prevFile в хранилише хэшей - агрегатор

                }

                filePath.addAll(dublFile); // объединяем списки нового и старых путей 
                hash = FileHash.get(file, ALGORITM); // пересчитываем хэш для нового файла

                //*>log
                    System.out.print("> hash calc " + (System.currentTimeMillis() - hashInvocTimeStart) + "ms ");

                addFileHash(fileHashDublesMap, hash, file); // отправляем новый file в хранилише хэшей - агрегатор
            }
         //*>log
            System.out.print("size: " + Long.toString(key) + "byte");
            System.out.println(" proc time " + (System.currentTimeMillis() - methodInvocTimeStart) + "ms ");
            System.out.println("-----");

        return CONTINUE;
    }
    
    /**
     * метод - аргегатор хэшей в формате <хэш><список Path> уникальные хэши будут миеть
     * список из одного пути. Если список больше одного значит лн сидержит Path к одинаковым 
     * файлам  с одинаковым хэшем.
     * @param key - хэш файла
     * @param filePath - путь к файлу
     */
    public void addFileHash(Map<String, List<Path>> map, String key, Path path) {
        List<Path> pathList = new ArrayList<>();
        pathList.add(path);

        List<Path> dublePath = map.put(
                Objects.requireNonNull(key, "Key value - (file hash) should not be null \n" + // Проверяем key на и выдаем сообщение
                "method: " + Thread.currentThread().getStackTrace()[1]                             // место ошибки
                ),
                pathList);

        if (Objects.nonNull(dublePath)) {
            pathList.addAll(dublePath);
        }
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.err.println(exc);
        return CONTINUE;
    }
}