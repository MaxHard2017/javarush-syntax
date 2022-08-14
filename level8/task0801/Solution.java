package level8.task0801;

import java.util.HashSet;
import java.util.Set;

public class Solution {
/*
 * Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё следующие строки:
        арбуз
        банан
        вишня
        груша
        дыня
        ежевика
        женьшень
        земляника
        ирис
        картофель

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
Требования:

    Объяви переменную коллекции Set с типом элементов String и сразу проинициализируй ee.
    Программа не должна считывать строки с клавиатуры.
    Программа должна добавлять в коллекцию 10 строк, согласно условию.
    Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.
 */
    public static void main(String[] args) {
        Set<String> plants = new HashSet<String>(10);
        plants.add("арбуз");
        plants.add("банан");
        plants.add("вишня");
        plants.add("груша");
        plants.add("дыня");
        plants.add("ежевика");
        plants.add("женьшень");
        plants.add("земляника");
        plants.add("ирис");
        plants.add("картофель");

        for (String item : plants) {
            System.out.println(item);
        }
    }
}
