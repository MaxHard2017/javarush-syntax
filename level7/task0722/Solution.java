package level7.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    /*
     * Создать список строк.
     * Ввести строки с клавиатуры и добавить их в список.
     * Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
     * Вывести строки на экран, каждую с новой строки.
     * Требования:
     *   •    Объяви переменную типа список строк и сразу проинициализируй ee.
     *   •    Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
     *   •    Саму строку "end" не нужно добавлять в список.
     *   •    Выведи список на экран, каждое значение с новой строки.
     *   •    Используй цикл for. 
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in,"cp866"));
        ArrayList <String> sStr = new ArrayList<>();
        String sTemp = "";

        do {
            sTemp = reader.readLine();
            if (sTemp.compareTo("end") != 0) sStr.add(sTemp);
        } while (sTemp.compareTo("end") != 0);

        for (String item : sStr) {
            System.out.println(item.length());
        }
    }
}
