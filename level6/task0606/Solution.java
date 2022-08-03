package level6.task0606;


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
// Чётные и нечётные циферки

    public static int even = 0;
    public static int odd = 0;

    public static void main( String[] args ) throws IOException {
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in, "cp866"));

        byte[] b = read.readLine().getBytes(); // читаем номер как строку и потом стрингу посимвольно (каждый символ - цифра чиста) переводим в массим байтов
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b); // создаем входной поток из массива байтов
        
        int iArrayValue = 0;
        while ((iArrayValue = byteArrayInputStream.read()) != -1) {//читаем из потока очередной байт символа в инт переменную iArrayValue
            if (iArrayValue % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
