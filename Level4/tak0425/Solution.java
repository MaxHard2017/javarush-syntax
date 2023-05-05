package level4.tak0425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution
/*
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
*/
{
    private int coodrX = 0;
    private int coordY = 0;

    public void setX(int x)
    {
        this.coodrX = x;
    }
    public void setY(int y)
    {
        this.coordY = y;
    }

    public int getX()
    {
        return this.coodrX;
    }
    public int getY()
    {
        return this.coordY;

    }
    public int quatter (int x, int y)
    {
        if (x > 0)
        {
            if ( y > 0)
            {
                return 1;
            }
            else
            {
                return 4;
            }
        }
        else
        {
            if (y > 0)
            {
                return 2;
            }
        }
        return 3;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        //ввод координат
        System.out.println("Введите координаты точки (целые занчения):");
        Solution dot = new Solution();
        dot.setX(Integer.parseInt(reader.readLine()));
        dot.setY(Integer.parseInt(reader.readLine()));
        System.out.println();
        System.out.println(dot.quatter(dot.getX(), dot.getY()));
 
    }
}