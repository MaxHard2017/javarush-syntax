package level7.task0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Solution {
/*
 1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
Требования:

    Программа должна создавать массив на 10 строк.
    Программа должна считывать 8 строк для массива с клавиатуры.
    Программа должна выводить на экран 10 строк, каждую с новой строки.
    Программа должна выводить на экран массив (10 элементов) в обратном порядке.
 */
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
        String[] sArray = new String[10];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i < sArray.length - 2; i++) {
            sArray[i] = read.readLine();
        }
        
        for (int i = 0; i < sArray.length; i++) {
            System.out.println(sArray[sArray.length - 1 - i]);
        }
    }
}