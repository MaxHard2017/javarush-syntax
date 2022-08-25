package level9.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
    Написать программу, которая вводит с клавиатуры строку текста.
    Программа должна вывести на экран две строки:
    1. первая строка содержит только гласные буквы из введённой строки.
    2. вторая - только согласные буквы и знаки препинания из введённой строки.
    Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
    Пример ввода:
        Мама мыла раму.
    Пример вывода:
        а а ы а а у
        М м м л р м .
    Требования:
        •    Программа должна считывать данные с клавиатуры.
        •    Программа должна выводить две строки.
        •    Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
        •    Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
        •    Каждая строка должна заканчиваться пробелом.
*/
public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static String vowelsString = "";
    public static String notvoewlString = "";


    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        char[] chInputAray = read.readLine().toCharArray();
        for (char c : chInputAray) {
            if (isVowel(c) && (!Character.isWhitespace(c))) {
                vowelsString += c + " ";
            }
            else if (!Character.isWhitespace(c)) {
                notvoewlString += c + " ";
            }
        }

        System.out.println(vowelsString);
        System.out.println(notvoewlString);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}