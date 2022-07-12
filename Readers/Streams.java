package Readers;
import java.io.*;

public class Streams 
{
    public static void main(String[] args) throws IOException 
    {   
        System.out.print("-"  + (char)13);
        {
            InputStreamReader inputStream = new InputStreamReader(System.in);
            int x = inputStream.read();
            System.out.println(x);
        }

        InputStreamReader reader = new InputStreamReader(System.in);
        while (true) 
        {
            int x = reader.read();
            System.out.println(x);
        }

    }
}