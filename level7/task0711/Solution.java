package level7.task0711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


public class Solution {
/*
 * 1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
Требования:
    •Объяви переменную типа список строк и сразу проинициализируй ee.
    •Программа должна считывать 5 строк с клавиатуры.
    •Удали последнюю строку и вставь её в начало. Повторить 13 раз.
    •Программа должна выводить список на экран, каждое значение с новой строки.
 */
    public static void main(String[] args) throws IOException, UnsupportedEncodingException {
        ArrayList<String> sList = new ArrayList<String>();          // создаем список строк
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i < 5; i++) sList.add(r.readLine());        // читаем с клавиатуры 5 строк в список

        String sTemp = "";
        for (int i = 0; i < 13; i++) {
            sTemp = sList.get(sList.size() - 1);
            sList.remove(sList.size() - 1);
            sList.add(0,sTemp);
        }
        for (String item : sList) System.out.println(item);
    }



}

