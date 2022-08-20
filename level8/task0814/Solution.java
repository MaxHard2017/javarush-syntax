package level8.task0814;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
/*
 * Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
Требования:
    •    Программа не должна выводить текст на экран.
    •    Программа не должна считывать значения с клавиатуры.
    •    Класс Solution должен содержать только три метода.
    •    Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
    •    Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
 */
    public static Set<Integer> createSet() {
       Set<Integer> intSet = new HashSet<Integer>();
        Collections.addAll(intSet, 1, 2, 3, 4 ,5, 6, 7, 8, 9, 10);
        Collections.addAll(intSet, 11, 12, 13, 14 ,15, 16, 17, 18, 19, 20);
        return intSet;    
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Predicate<Integer> pr= a->(a > 10); 
        set.removeIf(pr);
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> s = createSet();

        for (Integer item : s) {
            System.out.println(item);
        }
        
        System.out.println();
        s = removeAllNumbersGreaterThan10(s);
        for (Integer item : s) {
            System.out.println(item);
        }
    }
}
