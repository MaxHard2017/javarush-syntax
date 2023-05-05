package level4.task0415;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution //вычисление високосного года
{   
    public static void main(String[] args) throws Exception 
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
        int i = Integer.parseInt(reader.readLine());
        
        if (i % 400 == 0) 
            System.out.println("количество дней в году: 366");
        else
        {
            if (i % 100 == 0)
                System.out.println("количество дней в году: 365");
            else 
                if (i % 4 == 0)
                    System.out.println("количество дней в году: 366");
                else
                    System.out.println("количество дней в году: 365");
        }
        
    }
}