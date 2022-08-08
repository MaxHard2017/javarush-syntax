package level7.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
/*
 * 1. В методе initializeArray():
1.1. Создай массив на 20 чисел
1.2. Считай с консоли 20 чисел и заполни ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
Требования:

    Метод initializeArray должен создавать массив из 20 целых чисел.
    Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
    Метод max должен возвращать максимальный элемент из переданного массива.
    Метод main изменять нельзя. 
 */
    public static int arraySize = 20;
      
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] array20Int = new int[arraySize];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i < array20Int.length; i++) {
            array20Int[i] = Integer.parseInt(read.readLine());
        }
        return array20Int;
    }

    public static int max(int[] array) {
        int iMaximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > iMaximum) iMaximum = array[i];
        }
        return iMaximum;
    }
}
