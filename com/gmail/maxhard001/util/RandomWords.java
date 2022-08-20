package com.gmail.maxhard001.util;

public class RandomWords {

    public static String getWord(int numberOf) {
        String result = "";
        for (int i = 0; i < numberOf; i++) {
            result += Character.toString(97 + (int) (Math.random() * 25));
        }
        return result;
    }
    
    public static String wordRandomSize(int minSize, int maxSize) {
        int wordRandom = minSize + (int) (Math.random() * Math.abs(maxSize - minSize));
        return getWord(wordRandom);
    }


    public static void main(String[] args) {
        System.out.println(wordRandomSize(4, 9));
    }
}