package Level4.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
// Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
// Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
// Если имена и длины имен разные - ничего не выводить.
{   
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sInput = new String[2];
        for (int i = 0; i < sInput.length ; i++) sInput[i] = reader.readLine();
        
        if (sInput[0].equals(sInput[1]))
        {
            System.out.println("Имена идентичны");
        }
        else
        {
            if (sInput[0].length() == sInput[1].length())
                {
                    System.out.println("Длины имен равны");
                }
        }
    }
}
