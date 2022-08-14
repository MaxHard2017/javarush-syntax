package level7.task0724;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> family = new ArrayList<Human>();
        
        Human gf1 = new Human("Пантелеймон", true, 63);
        Human gm1 = new Human("Авдотья", false, 53);
        Human fr = new Human("Никифор", true, 34, gf1, gm1);
        Human gf2 = new Human("Мавлютий", true, 61);
        Human gm2 = new Human("Фатима", false, 49);
        Human mthr = new Human("Устья", false, 28, gf2, gm2);
        Human son1 = new Human("Гаврила", true, 13, fr, mthr);
        Human son2 = new Human("Савелий", true, 10, fr, mthr);
        Human dot1 = new Human("Кён Хи", false, 5, fr, mthr);
        
        family.add(gf1);
        family.add(gm1);
        family.add(fr);
        family.add(gf2);
        family.add(gm2);
        family.add(mthr);
        family.add(son1);
        family.add(son2);
        family.add(dot1);
        
        for (Human item : family) {
            System.out.println(item.toString());
        }

    }
    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
