package Level4.task0441;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{   
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        System.out.println(avg(a, b, c));
    }

    public static int avg (int a, int b, int c)
    {
        int min, max;
        if (a == b)
        {
            return a;
        }
        else 
        {
            if (a < b)
            {
                min = a;
                max = b; 
            } 
            else
            {
                min = b;
                max = a;
            }
        }

        if ((c == min) | (c == max))
        {
            return c;
        }
        else
        {
            if (c < min)
            {
                return min;
            }
            else
            {
                if (c > max)
                {
                    return max;
                }
                else return c;
            }   
        }

    }
    
}
