package level7.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Solution {
/*
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.
Требования:
    •Программа должна создавать массив на 15 целых чисел.
    •Программа должна считывать числа для массива с клавиатуры.
    •Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
    •Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.
    •Программа не должна выводить текст в консоль, если количество жителей на каждой стороне - одинаковое.
 */
    public static void main(String[] args) throws NumberFormatException, UnsupportedEncodingException, IOException {
        int[] iArray = new int[15];
        int countEven = 0; // счетчик четных
        int countOdd = 0;  //счетчик нечетных
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = Integer.parseInt(read.readLine());
            if (i % 2 == 0) {
                countEven += iArray[i];
            } else {
                countOdd += iArray[i];
            }           
        }

        System.out.println(countEven + " - " + countOdd);
        if (countEven == countOdd) {
            ;
        } else if (countEven > countOdd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей");
        }
    }
}
