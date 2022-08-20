package level8.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
Требования:
    •  Программа не должна выводить текст на экран.
    •    Программа не должна считывать значения с клавиатуры.
    •    Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
    •    Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
    •    Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/
public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> pepleMap = new HashMap<String, String>();
        pepleMap.put("Fox","Max");
        pepleMap.put("Iva","Lera");
        pepleMap.put("Mif","Teddy");
        pepleMap.put("Fabula","Lera");
        pepleMap.put("Knox","Harper");
        pepleMap.put("Brown","Lera");
        pepleMap.put("Talor","Max");
        pepleMap.put("Tatcher","Son");
        pepleMap.put("Rodshold","Nick");
        pepleMap.put("Musk","Ilon");
        return pepleMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> mapCopy = new HashMap<String, String>(map);
        Iterator<Map.Entry<String, String>> iterator = mapCopy.entrySet().iterator();
        Map.Entry<String, String> entry;
        String value;
        String key;
        while (iterator.hasNext()) {
            entry = iterator.next();
            value = entry.getValue();
            key = entry.getKey();

            for (Map.Entry<String, String> item : mapCopy.entrySet()) {
                if (value == item.getValue() & (key != item.getKey())) {
                    removeItemFromMapByValue(map, value);
                }
            }

        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> pepleMap =  createMap();
        System.out.println(pepleMap);
        removeTheFirstNameDuplicates(pepleMap);
        System.out.println(pepleMap);
    }
}
