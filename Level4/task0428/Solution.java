package level4.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution // Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
{
    public static void main(String[] args) throws Exception
    {
        String[] sInputStr = new String[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) sInputStr[i] = reader.readLine();

        int countInt = 0;// счетсичк положительных чисел
        for (int i = 0; i < 3; i++) if (Integer.parseInt(sInputStr[i]) > 0) countInt++;
        System.out.println(countInt);
    }    
}
