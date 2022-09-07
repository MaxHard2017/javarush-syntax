package level10.task1016;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Введи с клавиатуры 20 слов в список. Посчитай, сколько раз каждое из них встречается в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово, а второй - число раз, сколько раз данное слово встречалось в списке.

Выведи содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
Требования:
    •    Метод countWords должен объявлять и инициализировать HashMap с типом элементов <String, Integer>.
    •    Метод countWords должен возвращать созданный словарь.
    •    Метод countWords должен добавлять в словарь ключи, соответствующие уникальным словам, и значения по этим ключам, отображающие, сколько раз встречалось слово.
    •    Программа должна выводить на экран полученный словарь.
    •    Метод main должен вызывать метод countWords.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "cp866"));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);
        System.out.println();

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (String word1 : list) {
            if (!result.containsKey(word1)) {
                int countDuplicateWords = 0;
                for (String word2 : list) {
                    if (word1.equalsIgnoreCase(word2)) {
                        countDuplicateWords++;
                    }
                }
                result.put(word1, countDuplicateWords);
            }
        }
        //напишите тут ваш код
        return result;
    }
}