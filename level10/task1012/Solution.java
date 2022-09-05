package level10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
    Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.
        Пример вывода:
            а 5
            б 8
            в 3
            г 7
            д 0
            ...
            я 9
    Требования:
        •    Программа должна 10 раз считывать данные с клавиатуры.
        •    Программа должна выводить текст на экран.
        •    Выведенный текст должен содержать 33 строки.
        •    Каждая строка вывода должна содержать букву русского алфавита, пробел и количество раз, которое буква встречалась в введенных строках.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "cp866"));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        for (Character member : alphabet) {
            System.out.println(member + " " + countCharInTextList(list, member));
        }


        // напишите тут ваш код
    }

    // подсчет появления символа в строке
    public static int countChar(String inputString, char searchChar) {
        int count = 0;
        for (char member : inputString.toCharArray()) {
            if (member == searchChar) {
                count++;
            }
        }        
        return count;
    }
    // подсчет появления символа в тексте из списка строк
    public static int countCharInTextList(ArrayList<String> inputList, char searchChar) {
        int count = 0;
        for (String member : inputList) {
            count += countChar(member, searchChar);
        }
        return count;
    }
}