package com.gmail.maxhard001.util.withfiles.hash;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FileHash {
    static  MessageDigest SHA256;
    static  MessageDigest MD5;

    // инициализируем дигесты для двух алгоритмов
    static {
        try {
                SHA256 = MessageDigest.getInstance("SHA-256");
                MD5 = MessageDigest.getInstance("MD5");

            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
    }

    public static String get(File file) {

        try (
                DigestInputStream dis = new DigestInputStream(
                        new FileInputStream(file), SHA256);) {
            while (dis.read() != -1) {
                SHA256 = dis.getMessageDigest();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // byte to hex
        StringBuilder sb = new StringBuilder();
        for (byte item : SHA256.digest()) {
            sb.append(String.format("%02x", item));
        }

        return sb.toString();
    }
    
    public static String get(Path filePath) {

        try (
                DigestInputStream dis = new DigestInputStream(
                        new FileInputStream(filePath.toFile()), SHA256);) {
            while (dis.read() != -1) {
                SHA256 = dis.getMessageDigest();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // byte to hex
        StringBuilder sb = new StringBuilder();
        for (byte item : SHA256.digest()) {
            sb.append(String.format("%02x", item));
        }

        return sb.toString();
    }


    public static String get(String fileName) {
    
        try (
                DigestInputStream dis = new DigestInputStream(
                                         new FileInputStream(fileName), SHA256 );
        ) {
            while (dis.read() != -1) {
                SHA256 = dis.getMessageDigest();
            }
          
        } catch (IOException e) {
            e.printStackTrace();
        }

        // byte to hex
        StringBuilder sb = new StringBuilder();
        for (byte item : SHA256.digest()) {
            sb.append(String.format("%02x", item));
        }
        

        return sb.toString();
    }

}
