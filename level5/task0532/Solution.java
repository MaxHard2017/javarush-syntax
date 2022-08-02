package level5.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        System.out.println("Введите колличество чисел :");

        int numberQuantity = Integer.parseInt(reader.readLine());
        if (numberQuantity <= 0) {
            System.exit(1);                    //введено некорректное число - завершение программы
        }

        int[] iInput = new int[numberQuantity];
        System.out.println("Введите по порядку " + iInput.length + " чисела, а я определю максимальное");
        for (int i = 0; i < numberQuantity; i++) {
            iInput[i] = Integer.parseInt(reader.readLine());
        }
        
        int maximum = iInput[0];
        for (int i = 0; i < numberQuantity; i++) {
            if (iInput[i] > maximum) {
                maximum = iInput[i];
            }
        }
        System.out.println("Maximum = " + maximum);
    
    }
}