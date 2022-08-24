package level8.task0819;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /*
     * 1. Внутри класса Solution создать public static класс кот - Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
Требования:
    Программа должна выводить текст на экран.
    Внутри класса Solution должен быть public static класс Cat с конструктором по умолчанию.
    Метод createCats() класса Solution должен возвращать множество (Set), содержащее 3 кота.
    Метод printCats() класса Solution должен вывести на экран всех котов из множества. Каждый кот с новой строки.
    Метод main() должен один раз вызывать метод createCats().
    Метод main() должен вызывать метод printCats().
    Метод main() должен удалять одного кота из множества котов.
     */
    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void printCats(Set<Cat> catSet) {
            for (Cat cat : catSet) {
                System.out.println( "Имя кота: " + cat.getName());
            }
        }

        public static Set<Cat> createCats() {
            Set<Cat> catSet = new HashSet<Cat>();
            catSet.add(new Cat("Васька"));
            catSet.add(new Cat("Мурка"));
            catSet.add(new Cat("Зевс"));
            return catSet;
        }
    }
    
    
    public static void main(String[] args) {
        Set<Cat> cats = Cat.createCats();
        cats.remove(cats.iterator().next());
        Cat.printCats(cats);
    }
}
