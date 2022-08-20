package level8.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
Требования:
    •    Программа не должна выводить текст на экран.
    •    Программа не должна считывать значения с клавиатуры.
    •    Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
    •    Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> salaryMap = new HashMap<String, Integer>();
        salaryMap.put("Fox", 100);
        salaryMap.put("Iva", 600);
        salaryMap.put("Mif", 1000);
        salaryMap.put("Fabula", 300);
        salaryMap.put("Knox", 500);
        salaryMap.put("Brown", 800);
        salaryMap.put("Talor", 850);
        salaryMap.put("Tatcher", 450);
        salaryMap.put("Rodshold", 765);
        salaryMap.put("Musk", 900);
        return salaryMap;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copyMap = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> item : copyMap.entrySet()) {
            if (item.getValue() < 500) map.remove(item.getKey());
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> peopleSalaryMap = createMap();
        // System.out.println(peopleSalaryMap);
        removeItemFromMap(peopleSalaryMap);
        // System.out.println("Rich people: " + peopleSalaryMap);
    }
}