package level7.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
        ArrayList<String> sList = new ArrayList<String>();
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i <10; i++) sList.add(bufRead.readLine());
        // читаем 10 строк с клавиатуры в список sList

        int maxSize = 0;    // размер минималной строки
        int minSize = sList.get(0).length(); // размер минимальной строки инициализируем размером первой строки списка

        for (String item : sList) {
            if(item.length() > maxSize) maxSize = item.length();    // запоминаем максимум
            if(item.length() < minSize) minSize = item.length();    // запоминаем минимум
        }
        for (String item : sList) {
            if ((item.length() == maxSize) || (item.length() == minSize)) {
                System.out.println(item);
                break;
            }
        }       
    }
}
