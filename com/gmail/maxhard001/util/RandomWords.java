package com.gmail.maxhard001.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

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

    public static long getTimeMsOfInsert(List<Object> list) {
            //напишите тут ваш код
        Date currentTime = new Date();
        insert1000000(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Результат в миллисекундах: " + msDelay);
        return msDelay;
     
    }

    public static void insert1000000(List<Object> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(0, new Object());
        }
    }
    
    public static void main(String[] args) {
        System.out.println(wordRandomSize(4, 9));
        getTimeMsOfInsert(new ArrayList<Object>());
        getTimeMsOfInsert(new LinkedList<Object>());
    }
}