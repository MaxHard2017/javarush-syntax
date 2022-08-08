package level7.task0708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
/*
 * 1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
Требования:
    •В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
    •Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
    •Программа должна выводить самую длинную строку на экран.
    •Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
 */
    private static ArrayList<String> strings;      
    
    public static void main(String[] args) throws IOException {
        strings = new ArrayList<String>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i < 5; i++) {
            strings.add(read.readLine());
        }

        int maxLength = 0; // вычисляем максимальную строку в списке в переменной maxLenth
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > maxLength) maxLength = strings.get(i).length();
        }
    
        // Вывод всех скрок c максимальной длинной = maxLength
        for (String item : strings) {
            if (item.length() == maxLength) System.out.println(item);
        }
    }
}