package level9.task0927;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 
    Есть класс кот - Cat, с полем "имя" (String).
    Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
    Получить из Map множество(Set) всех котов и вывести его на экран.
    Требования:
        •    Программа не должна считывать данные с клавиатуры.
        •    Метод createMap должен создавать новый объект HashMap<String, Cat>.
        •    Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
        •    Метод createMap должен возвращать созданный словарь.
        •    Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
        •    Программа должна вывести всех котов из множества на экран.
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> catMap = new HashMap<String, Cat>();
        for (int i = 0; i < 10; i++) {
            catMap.put("CatNo" + i, new Cat("Murz" + i));
        }
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catSet = new HashSet<>();

        Iterator<Map.Entry<String, Cat>> catIterator = map.entrySet().iterator();
        Map.Entry<String, Cat> mapItem;
        Cat catValue ;
        
        while (catIterator.hasNext()) {
            mapItem = catIterator.next();
            catValue = mapItem.getValue();
            catSet.add(catValue);
        }
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}