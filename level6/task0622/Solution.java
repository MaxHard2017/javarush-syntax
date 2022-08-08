package level6.task0622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
/*
 * Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17

 */
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        ArrayList<Integer> sortNumList = new ArrayList<Integer>(5);
        
        for (int i = 0; i < 5; i++) {
            sortNumList.add(Integer.parseInt(read.readLine()));    
        }
    
        Collections.sort(sortNumList);

        System.out.println();
        for (int arrayElement : sortNumList) {
            System.out.println(arrayElement);            
        }

    }
}
