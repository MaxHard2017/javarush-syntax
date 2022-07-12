package Level3.lesson12.task0132;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.lang.reflect.Array;
//import java.lang.reflect.GenericSignatureFormatError;

public class Solution 
//Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. 
//Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

{
    public static void main(String[] args) 
    {
        System.out.println(sumDigitsInNumber(9876));
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
        int i = 0;
        try {
            i = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
             
        if (i % 400 == 0) 
        System.out.println("количество дней в году: 366");
    else
    {
        if (i % 100 == 0)
            System.out.println("количество дней в году: 365");
        else 
            if (i % 4 == 0)
                System.out.println("количество дней в году: 366");
            else
                System.out.println("количество дней в году: 365");
    }
    }
// Решени через численные вычисления
/*
    public static int countDigits (int number) // вычисляет кол-во знаков десятичного числа
    {
        int count = 0;
        
        for(int i = 1; (number / (10 * i) > 1); i++) {count = i;} // вычисления  кол-ва рязраядов числа, делим число а 10, 100 ,1000 и т.д.
        
        return count;
    }    
        
    public static int sumDigitsInNumber(int number) //делим число на 10 в степени старшего разряда на цело, остаток делим на 10 в тепени более младшего разряда и до единиц 
    {
        int digitsSumm = 0; // тут суммируем разряды числа 
        
        for (int digitsCounter = countDigits(number); digitsCounter > 0 ; digitsCounter--)
        {
            digitsSumm = digitsSumm + number / (int) Math.pow(10, digitsCounter);
            number = number % (int) Math.pow(10, digitsCounter); //остаток от деления числа на 10 в степени выбранного разряда помещаем обратно в number для деления на 10 в степени меньшего разряда
        }
        digitsSumm = digitsSumm + number; // добавляем последний остаток деления - значение последнего разяда, единицы
        return digitsSumm;
    }
*/
// Решение через строки массивом символов
/*    
   public static int sumDigitsInNumber(int number)
    {
        int result = 0;
        String str = Integer.toString(number);
        char[] cArray = str.toCharArray();

        for (char c : cArray)
        {
            result = result + Character.getNumericValue(c);
//или            result = result + Integer.parseInt (String.valueOf(c)); 
        }
        return result;
    }
*/

// через строки и массим байт
/*
    public static int sumDigitsInNumber (int number)
    {
        int result = 0;
        byte[] b;
        String sNumber = Integer.toString(number);
        b = sNumber.getBytes();
        for(int i = 0; i < b.length; i ++)
        {
            result = result + Character.getNumericValue((char)b[i]);
        }
        return result;
    }
*/
// через потоки
    public static int sumDigitsInNumber (int number)
    {
        int result = 0;
        byte[] b = Integer.toString(number).getBytes(); // переводим номер в стринг и потом в массим байтов
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b); // создаем входной поток из массива байтов
        
        int iArrayValue = 0;
        while ((iArrayValue = byteArrayInputStream.read()) != -1) //читаем из потока очередной байт символа в инт переменную iArrayValue
            result = result + Character.getNumericValue((char)iArrayValue); // инт значение симвода кастуем к значению char символа (цифра) переводим в инт и суммируем
    
        return result;
    }
/*
    public class Cat {
        private static String fullName;
    
        public void setName(String firstName, String lastName) {
            String fullName = firstName + " " + lastName;
            Cat.fullName = fullName;
            //напишите тут ваш код
        }
    }
*/
    
    public static void checkInterval(int number) {
        if ((number > 50) | (number < 100))
            System.out.println("Число " + number + " содержится в интервале.");//напишите тут ваш код
        else
            System.out.println("Число " +  number + " не содержится в интервале.");
    }


}