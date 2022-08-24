package level8.task0820;

import java.util.HashSet;
import java.util.Set;
import java.lang.Object;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
       
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            result.add( new Cat() );
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            result.add( new Dog() );
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
       
        for (Object petItem : cats) {
            pets.remove(petItem);       //перебираем по котам иудаляем в питомцах     
        }
        /*
        for (Object object : copyPets) {
            if ( object.getClass() == Cat.class ) {
                pets.remove(object);
            }
        }//напишите тут ваш код
        */
    }

    public static class Cat {

    }
    public static class Dog {

    }

    public static void printPets(Set<Object> pets) {
        for (Object object : pets) {
            System.out.println(object);
        }
        //напишите тут ваш код
    }

}

