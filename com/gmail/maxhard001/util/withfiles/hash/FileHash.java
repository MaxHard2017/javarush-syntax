package com.gmail.maxhard001.util.withfiles.hash;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class FileHash {
    private static MessageDigest SHA256;
    private static MessageDigest MD5;
    private static MessageDigest SHA512;
    private static Checksum      CRC32;
    private static Checksum      CRC32C;

    /**
     * Calculates hash o CRC of selected file
     * @param filePath - path to selected file
     * @param algorithm - algorithm: SHA-256, SHA-512, MD5, CRC32, CRC32C
     * @return String representation of calculated value in hexidecimal form (base 16)
     */
    public static String get(Path filePath, String algorithm) {
        try {
            switch (algorithm) {
                case "SHA-256":
                    if (Objects.isNull(SHA256)) {
                        SHA256 = MessageDigest.getInstance("SHA-256");
                    }
                return getSHA(filePath, SHA256);
               
                case "SHA-512":
                    if (Objects.isNull(SHA512)) {
                        SHA512 = MessageDigest.getInstance("SHA-512");
                    }
                return getSHA(filePath, SHA512);

                case "MD5":
                    if (Objects.isNull(MD5)) {
                        MD5 = MessageDigest.getInstance("MD5");
                    }
                return getSHA(filePath, MD5);

                case "CRC32":
                    if (Objects.isNull(CRC32)) {
                        CRC32 = new java.util.zip.CRC32();
                    }
                return getCRC(filePath, CRC32);

                case "CRC32C":
                    if (Objects.isNull(CRC32C)) {
                        CRC32C = new java.util.zip.CRC32C();
                    }
                return getCRC(filePath, CRC32C);
                        
                default:
                    System.out.print("Wrong hash algorithm passed: ");
                throw new NoSuchAlgorithmException();
            }   
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    /**
     * @param filePath - path to selected file
     * @param algorithm - selected algorithm
     * @return
     */
    private static String getSHA(Path filePath, MessageDigest algorithm) {
        try (
            DigestInputStream dis = new DigestInputStream(
                        new BufferedInputStream(
                        new FileInputStream(filePath.toFile())),
                                    algorithm);
        ){
            while (dis.read() != -1) {
                algorithm = dis.getMessageDigest();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // byte to hex
        StringBuilder sb = new StringBuilder();
        for (byte item : algorithm.digest()) {
            sb.append(String.format("%02x", item));
        }
        return sb.toString();
    }
    
    
    /**
     * @param filePath - path to selected file
     * @param algorithm - selected algorithm
     * @return
     */
    private static String getCRC(Path filePath, Checksum algorithm) {
       
        Long resultCRC = 0L;
        try (
            CheckedInputStream cis = new CheckedInputStream(
                        new BufferedInputStream(
                        new FileInputStream(filePath.toFile())),
                            algorithm);
        ){
            while (cis.read() > 0); // в пустом цикле считываем файл до конца в cis
            
            resultCRC = cis.getChecksum().getValue();
                
        } catch (IOException e) {
            e.printStackTrace();
        }
       return Long.toHexString(resultCRC);  
    }
}