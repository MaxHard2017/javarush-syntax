package level9.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
    Задача: Пользователь вводит с клавиатуры список слов (и чисел).
    Слова вывести в возрастающем порядке, числа - в убывающем.
        Пример ввода:
            Вишня
            1
            Боб
            3
            Яблоко
            22
            0
            Арбуз
    Пример вывода:
            Арбуз
            22
            Боб
            3
            Вишня
            1
            0
            Яблоко
    Требования:
        •    Программа должна считывать данные с клавиатуры.
        •    Программа должна выводить данные на экран.
        •    Выведенные слова должны быть упорядочены по возрастанию (используй готовый метод isGreaterThan).
        •    Выведенные числа должны быть упорядочены по убыванию.
        •    Метод main должен использовать метод sort.
        •    Метод sort должен использовать метод isGreaterThan.
        •    Метод sort должен использовать метод isNumber.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }
        String[] array = list.toArray(new String[0]);

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] sArray) {
        Integer minDigitIndex = null;
        Integer maxStringIndex = null;
        String testString;
        boolean ordered = false;

        while (!ordered) {
            ordered = true;
            minDigitIndex = null;
            maxStringIndex = null;

            for (int i = 0; i < sArray.length; i++) {
                testString = sArray[i];
                
                if ( isNumber(testString) ) {
                    if (minDigitIndex == null) {
                        minDigitIndex = i;
                    } else if ( isGreaterThan(Integer.parseInt(sArray[i]),
                                              Integer.parseInt(sArray[minDigitIndex])) ) {    // Если находим элемент больше нашего минимального
                        swapStringsInArray(sArray, i, minDigitIndex);               // то меняем местами 
                        minDigitIndex = i;                                          // и указатель на минимальный индекс перемещаем на наш найденный i
                        ordered = false;
                    } else {
                            minDigitIndex = i;                                          // и указатель на минимальный индекс перемещаем на наш найденный i
                        }
                } else {
                    if (maxStringIndex == null) {
                        maxStringIndex = i;
                    } else if ( isGreaterThan(sArray[maxStringIndex], sArray[i]) ) {
                        swapStringsInArray(sArray, i, maxStringIndex);               
                        maxStringIndex = i;                                          
                        ordered = false;
                    } else {
                        maxStringIndex = i;                                          // и указатель на минимальный индекс перемещаем на наш найденный i
                    }
                }
            }
        }
    }

    // Метод для перестановки строк в массиве
    public static void swapStringsInArray(String[] sArray, int index1, int index2) {
        String sTemp = sArray[index1];
        sArray[index1] = sArray[index2];
        sArray[index2] = sTemp;
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    // Метод для сравнения int: 'а' больше чем 'b'
    public static boolean isGreaterThan(int a, int b) {
        return a - b > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }
        return true;
    }
}