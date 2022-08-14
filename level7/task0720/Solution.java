package level7.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    /*
     * Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.
Требования:

    Объяви переменную типа список строк и сразу проинициализируй ee.
    Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
    Переставить M первых строк в конец списка.
    Выведи список на экран, каждое значение с новой строки.
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, "cp866"));

        int n = Integer.parseInt(read.readLine());      // вводим количество строк
        int m = Integer.parseInt(read.readLine());      //сколько сторк переставть в конец

        ArrayList <String> sList = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            sList.add(read.readLine());
        }

        for (int i = 0; i < n - m; i++) {
            sList.add(0, sList.get(n - 1));
            sList.remove(n);
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println(sList.get(i));
        }
    }
}