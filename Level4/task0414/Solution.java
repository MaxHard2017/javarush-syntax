package Level4.task0414;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution 
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int sideA = Integer.parseInt(reader.readLine());
        int sideB = Integer.parseInt(reader.readLine());
        int sideC = Integer.parseInt(reader.readLine());

        System.out.println (strIsTriangleExist (sideA, sideB, sideC));
    }

    public static String strIsTriangleExist (int a, int b, int c)
    {
        if ((a >= (b+c) ) || (b >= (c+a)) || (c >= (a+b)))
        {
            return "Треугольник не существует.";
        }
        return "Треугольник существует.";
    }
}