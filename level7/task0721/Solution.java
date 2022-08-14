package level7.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
     * Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
Требования:
    •    В классе Solution создай статический публичный метод int[] getInts().
    •    Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
    •    В методе main создай и проинициализируй массив с помощью метода getInts(), найди и выведи через пробел максимальный и минимальный элемент массива.
    •    Используй цикл for
     */

     public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.print("\033[H\033[2J");  
        int maximum = 0;
        int minimum = 0;
        int[] iArray = getInts();
        
        maximum = minimum = iArray[0];
        for (int i = 0; i < iArray.length; i++)  {
            if ( iArray[i] < minimum) minimum = iArray[i];
            if ( iArray[i] > maximum) maximum = iArray[i];
        }
        
        System.out.print(maximum + " " + minimum);
     }

     public static int[] getInts() throws NumberFormatException, IOException {
        int[] iArray = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = Integer.parseInt(reader.readLine());
        }
        return iArray;
        
    }
}


