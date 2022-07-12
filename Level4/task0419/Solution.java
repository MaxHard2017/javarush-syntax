package Level4.task0419;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
// Ввести с клавиатуры четыре числа, и вывести максимальное из них.
//Если числа равны между собой, необходимо вывести любое.
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
        int[] x = new int[4];
        for (int i = 0; i < 4; i++)
        {
            x[i] = Integer.parseInt(reader.readLine());
        }
        
        int temp = x[0];
        for (int i = 1; i < 4; i++)
        {
            if (x[i] >= temp) temp = x[i];
        }
        System.out.println(temp);
    }
}
