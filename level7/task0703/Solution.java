package level7.task0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Solution {
/*
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
Требования:
    •Программа должна создавать массив на 10 строк.
    •Программа должна создавать массив на 10 целых чисел.
    •Программа должна считывать строки для массива с клавиатуры.
    •Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.
*/
    public static void main(String[] args) throws IOException, UnsupportedEncodingException {
        String[] sArray = new String[10];
        int[] iArray = new int[10];

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = read.readLine();
            iArray[i] = sArray[i].length();
            System.out.println(iArray[i]);
        }
    }
}
