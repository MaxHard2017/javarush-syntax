package level7.task0715;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
/*
 * 1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.
Требования:
    •Программа не должна считывать данные с клавиатуры.
    •Объяви переменную типа список строк и сразу проинициализируй ee.
    •Добавь в список слова: «мама», «мыла», «раму».
    •После каждого слова добавь в список строку, содержащую слово «именно».
    •Выведи элементы списка на экран, каждый с новой строки.
 */
    public static void main(String[] args) {
        ArrayList<String> sList = new ArrayList<String>();
        Collections.addAll(sList,"мама", "мыла", "раму");
                
        for (int i = 1; i < 6; i++) {
            if (!(i % 2 == 0)) sList.add(i, "именно");
        }
    
        for (String item : sList) System.out.println(item);
    }
}