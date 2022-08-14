package level8.task0802;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
/*]
 * Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
        арбуз - ягода,
        банан - трава,
        вишня - ягода,
        груша - фрукт,
        дыня - овощ,
        ежевика - куст,
        жень-шень - корень,
        земляника - ягода,
        ирис - цветок,
        картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
Требования:
    •    Объяви переменную коллекции Map с типом элементов String, String и сразу проинициализируй ee.
    •    Программа не должна считывать значения с клавиатуры.
    •    Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
    •    Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
 */
    public static void main(String[] args) {
        Map<String, String> mapPlants = new HashMap<String, String>();
        mapPlants.put("арбуз","ягода");
        mapPlants.put("банан","трава");
        mapPlants.put("вишня","ягода");
        mapPlants.put("груша","фрукт");
        mapPlants.put("дыня","овощ");
        mapPlants.put("ежевика","куст");
        mapPlants.put("жень-шень","корень");
        mapPlants.put("земляника","ягода");
        mapPlants.put("ирис","цветок");
        mapPlants.put("картофель","клубень");
        
        Iterator<Map.Entry<String, String>> iterator = mapPlants.entrySet().iterator();
        Map.Entry<String, String> pair;
        String key = "";
        String value = "";

        while ( iterator.hasNext()) {
            pair = iterator.next();
            key = pair.getKey();
            value = pair.getValue();
            System.out.println( key + " - " + value);
        }
    }
}