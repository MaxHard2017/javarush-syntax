package level8.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
            Пример ввода:
            мама мыла раму.
            Пример вывода:
            Мама Мыла Раму.
            Требования:
    Программа должна выводить текст на экран.
    Программа должна считывать строку с клавиатуры.
    Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        char[] chArray  = reader.readLine().toCharArray();         //читаем из буфера в массив чар сразу
        
        boolean startWord = true;                                  // признак начала слова
        for  ( int i = 0; i < chArray.length; i++ ) {
            if ( Character.isLetterOrDigit(chArray[i])  && (startWord) ) {
                chArray[i] = Character.toUpperCase(chArray[i]);
                startWord = false;                                 // после заглавноой скидываем признак начала в false
            } else if (Character.isWhitespace(chArray[i])) {    
                startWord = true;                                  // при нахождении любого пробела или другова вайтспеса устанавливаем startWord - ждем начала слова
            }
        }
        
        System.out.println(String.valueOf(chArray));
    }
}
