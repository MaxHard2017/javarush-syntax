package level6.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
/*
 * Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей

 */


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "cp866"));

        String grandfaName = reader.readLine();
        Cat catGrandfa = new Cat(grandfaName, null,null);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName, null,null);
        
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandfa, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandma);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather,catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather,catMother);

        System.out.println(catGrandfa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            String sResult ="The cat's name is " + name;

            if (mother == null) {
                sResult = sResult +  ", no mother";
            }
            else {
                sResult = sResult + ", mother is " + mother.name;
            }
            
            if (father == null) {
                sResult = sResult +  ", no father";
            } else {
                sResult = sResult + ", father is " + father.name;
            }
            return sResult;
        }
    }
}
