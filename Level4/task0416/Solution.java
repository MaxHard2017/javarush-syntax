package Level4.task0416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution 
// Работа светофора для пешеходов запрограммирована следующим образом:
// в начале каждого часа в течение трех минут горит зелёный сигнал,
// затем в течение одной минуты - жёлтый,
// а потом в течение одной минуты - красный,
// затем опять зелёный горит три минуты и т. д.
{
    public static void main(String[] args) throws NumberFormatException, IOException 
    {      
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double currentTime = Double.parseDouble(reader.readLine()); // кол-во минут текаущего часа

        int swichTime = (int)currentTime % 5; // время в минутах от начала цикла
                
        if (swichTime <= 2) System.out.println("зелёный");
            else if (swichTime == 3) System.out.println("желтый");
                else System.out.println("красный");
    }    
}