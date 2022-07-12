package level5.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
*/

public class Solution
{   
public static double mean() throws Exception
{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int summ = 0;
    int iInputNum = 0;
    int count = 0;
    while (true)
    {
        iInputNum = Integer.parseInt(reader.readLine());
        if (iInputNum == -1) break;
        count++;
        summ += iInputNum;
    }
    if (count != 0) return  ((double)summ/count);
    else return 0;
}



    public static void main(String[] args) throws Exception
    {
        System.out.println(mean());
    }    
}
