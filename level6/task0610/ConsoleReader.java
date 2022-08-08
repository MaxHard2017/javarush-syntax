package level6.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader read = new BufferedReader( new InputStreamReader( System.in, "cp866" ) );
        return read.readLine();
    }

    public static int readInt() throws Exception {
        BufferedReader read = new BufferedReader( new InputStreamReader( System.in, "cp866" ) );
        return Integer.parseInt(read.readLine());
    }

    public static double readDouble() throws Exception {
        BufferedReader read = new BufferedReader( new InputStreamReader( System.in, "cp866" ) );
        return Double.parseDouble(read.readLine());
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader read = new BufferedReader( new InputStreamReader( System.in, "cp866" ) );
        return Boolean.parseBoolean(read.readLine());
    }

    public static void main(String[] args) throws Exception  {
        System.out.println("String: " + readString());
        System.out.println("int: " + readInt());
        System.out.println("double: " + readDouble());
        System.out.println("bool: " + readBoolean());
    }
}
