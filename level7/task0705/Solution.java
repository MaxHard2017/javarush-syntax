package level7.task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Solution {
/*
 * 1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
Требования:

    Программа должна создавать большой массив на 20 целых чисел.
    Программа должна считывать с клавиатуры 20 чисел для большого массива.
    Программа должна создавать два маленьких массива на 10 чисел каждый.
    Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.
 */
    public static void main(String[] args) throws NumberFormatException, UnsupportedEncodingException, IOException {
        int[] iArray = new int[20];
        int[] iArray1 = new int[10];
        int[] iArray2 = new int[10];

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = Integer.parseInt(read.readLine());            
        }

        for (int i = 0; i < iArray1.length; i++) {
            iArray1[i] = iArray[i];
            iArray2[i] = iArray[iArray.length - 10 + i];
            System.out.println(iArray2[i]);
        }
    }
}
