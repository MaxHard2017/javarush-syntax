package level7.task0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException, UnsupportedEncodingException {
        ArrayList<String> sList = new ArrayList<String>();
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i < 5; i++) sList.add(bufRead.readLine());
        // читаем 5 строк с клавиатуры в список sList

        sList.remove(2);
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(sList.size() - 1 -i));
        }
    }
}