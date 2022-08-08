package level6.task0611;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class StringHelper {
/*
  Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.
*/    
    public static String multiply(String text, int count) throws Exception {
        String result = text;
        
        for (int i = 0; i < count - 1; i++) {
            result = result + text;
        }
        return result;
    }

    public static String multiply(String text) throws Exception {
        return multiply(text, 5);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        String t = read.readLine();
        int iQuatity = Integer.parseInt(read.readLine());
        System.out.println(multiply(t, iQuatity));
        System.out.println(multiply(t));
    }
}
