package level8.task0824;


import java.util.ArrayList;

/* 
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
Требования:
    Программа должна выводить текст на экран.
    Класс Human должен содержать четыре поля.
    Класс Human должен содержать один метод.
    Класс Solution должен содержать один метод.
    Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> family = new ArrayList<Human>();
        
        Human gf1 = new Human("Пантелеймон", true, 63);
        Human gm1 = new Human("Авдотья", false, 53);
        Human fr = new Human("Никифор", true, 34);
        Human gf2 = new Human("Мавлютий", true, 61);
        Human gm2 = new Human("Фатима", false, 49);
        Human mthr = new Human("Устья", false, 28);
        Human son1 = new Human("Гаврила", true, 13);
        Human son2 = new Human("Савелий", true, 10);
        Human dot1 = new Human("Кён Хи", false, 5);
        
        gf1.children.add(fr);
        gm1.children.add(fr);
        gf2.children.add(mthr);
        gm2.children.add(mthr);
        fr.children.add(son1);
        fr.children.add(son2);
        fr.children.add(dot1);
        mthr.children.add(son1);
        mthr.children.add(son2);
        mthr.children.add(dot1);

        family.add(gf1);
        family.add(gm1);
        family.add(fr);
        family.add(gf2);
        family.add(gm2);
        family.add(mthr);
        family.add(son1);
        family.add(son2);
        family.add(dot1);
    
        for (Human human : family) {
            System.out.println(human);
        }
        
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human( String name, boolean sex, int age ) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}