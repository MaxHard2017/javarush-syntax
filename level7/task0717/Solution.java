package level7.task0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Solution {
/*
* 1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
3. Выведи результат на экран, каждое значение с новой строки.
Требования:
    Объяви переменную типа список строк и сразу проинициализируй ee.
    Считай 10 строк с клавиатуры и добавь их в список.
    Метод doubleValues должен удваивать элементы списка по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
    Выведи получившийся список на экран, каждый элемент с новой строки.
 */
    public static void main(String[] args) throws IOException, UnsupportedEncodingException {
        ArrayList<String> sList = new ArrayList<String>();
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i < 10; i++) sList.add(bufRead.readLine());
        // читаем 10 строк с клавиатуры в список sList

        ArrayList<String> result = doubleValues(sList);
        for (String sItem : result) System.out.println(sItem);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i));
            i++;
        }

        return list;
    }
}