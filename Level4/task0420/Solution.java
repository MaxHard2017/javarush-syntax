package Level4.task0420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution 
// Ввести с клавиатуры три числа, и вывести их в порядке убывания.
// Выведенные числа должны быть разделены пробелом.
{
    public static void main(String[] args) throws NumberFormatException, IOException 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] iInput = new int[3];
        for (int i = 0; i < iInput.length ; i++) iInput[i] = Integer.parseInt(reader.readLine());

        arrangeArrayDissent(iInput);
        for (int i = 0; i < (iInput.length ); i++) System.out.print(iInput[i] + " ");
    }


    public static void arrangeArrayDissent(int[] inputArray)
    {
        int minValue = inputArray[0];
        for (int i = 0; i < (inputArray.length - 1); i++)
        {
            if (inputArray[i] < inputArray[i+1]) // если следующее значение меньше предыдущего
            {
                minValue = inputArray[i];        // меняем эти два значения местами
                inputArray[i] = inputArray[i+1];
                inputArray[i+1] = minValue;
                i = -1;                           // начинаем просматривать массив сначала
            }
        }
    }
}
