package level7.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    /*
     * Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.
Подсказка:
Не забудь импортировать класс: java.util.ArrayList;
Требования:
    Объяви переменную типа список целых чисел и сразу проинициализируй ee.
    Считай 10 целых чисел с клавиатуры и добавь их в список.
    Выведи числа в обратном порядке.
    Используй цикл for.
     */
    public static void main(String[] args) throws IOException {
        
        ArrayList<Integer> iList = new ArrayList<Integer>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i < 10; i++) {
            iList.add(Integer.parseInt(read.readLine()));
        }
        
        for (int i = 0; i < iList.size(); i++) {
            System.out.println(iList.get(iList.size() - 1 - i));
        }
    }
}
