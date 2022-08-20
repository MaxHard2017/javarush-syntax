package level8.task0815;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    /*
     * Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
Требования:
    •    Программа не должна выводить текст на экран.
    •    Программа не должна считывать значения с клавиатуры.
    •    Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
    •    Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
    •    Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
     */
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Fox","Max");
        map.put("Iva","Lera");
        map.put("Mif","Teddy");
        map.put("Fabula","Lera");
        map.put("Knox","Harper");
        map.put("Brown","Lera");
        map.put("Talor","Max");
        map.put("Tatcher","Son");
        map.put("Rodshold","Nick");
        map.put("Musk","Ilon");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        Map.Entry<String, String> mapItem;
        while(iterator.hasNext()) {
            mapItem = iterator.next();
            if (mapItem.getValue() == name) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        Map.Entry<String, String> mapItem;
        while(iterator.hasNext()) {
            mapItem = iterator.next();
            if (mapItem.getKey() == lastName) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> personMap = createMap();
        System.out.println(getCountTheSameFirstName(personMap, "Lera"));
        System.out.println(getCountTheSameLastName(personMap, "Green"));
    }
}
