package level8.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.
Требования:
    •    Программа должна считывать одно значение с клавиатуры.
    •    Программа должна выводить текст на экран.
    •    Программа должна использовать коллекции.
    •    Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<String> monthList = new ArrayList<String>();
        monthList.add("January");
        monthList.add("February");
        monthList.add("March");
        monthList.add("April");
        monthList.add("May");
        monthList.add("June");
        monthList.add("July");
        monthList.add("August");
        monthList.add("September");
        monthList.add("October");
        monthList.add("November");
        monthList.add("December");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String sInput = read.readLine();
        
        if (monthList.indexOf(sInput) >= 0) {
            System.out.println(sInput + " is the " 
                               + (monthList.indexOf(sInput) + 1) + " month");
        }else {
            System.out.println(sInput + " isn't a month");
        }
    }
}