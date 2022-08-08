package level7.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException, UnsupportedEncodingException {
        ArrayList<String> sList = new ArrayList<String>();
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i < 10; i++) sList.add(bufRead.readLine());
                                                                                    // читаем 10 строк с клавиатуры в список sList
        for (int i = 0; i < sList.size() - 1; i++) {                                // сравниваем n-1 раз (9)
            if (sList.get(i).length() > sList.get(i + 1).length()) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}