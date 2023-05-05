package level4.task0417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws NumberFormatException, IOException 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        int x3 = Integer.parseInt(reader.readLine());
        
        if (x1 == x2) 
        {
            System.out.print(x1 + " " + x2);
            if (x1 == x3) System.out.print(" " + x3);
        }
        else 
        {
            if (x1 == x3)
            {
                System.out.print(x1 + " " + x3);
                if (x1 == x2) System.out.println(" " + x2);
            }
            else
            {
                if (x2 == x3)
                {
                    System.out.print(x2 + " " + x3);
                    if (x2 == x1) System.out.println(" " + x1);
                }
            }
        
        }
    }
}
