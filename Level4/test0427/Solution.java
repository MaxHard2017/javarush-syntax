package Level4.test0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
/*
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
*/

{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sIn = "";
        int iIn = 0;
        sIn = reader.readLine();
        iIn = Integer.parseInt(sIn); // читаем целое число
        if ((iIn >= 1) && (iIn <= 999)) System.out.println(testInt(iIn));
    }
        

    public static String testInt(int iNum) // определяет знак и кол-во цифр трехзначного числа
    {
        String sResult ="";
        if ((iNum % 2) == 0)
        {
            sResult = sResult + "четное";
        }
        else
        {
            sResult = sResult + "нечетное";
        }

        {
            double iNumDigits = Math.log10(iNum); //считаем кол-во символов
            if ((iNumDigits >= 0) && (iNumDigits < 1))
            {
                return sResult = sResult + " однозначное число";
            }
            if ((iNumDigits >= 1) && (iNumDigits < 2))
            {
                return sResult = sResult + " двузначное число";
            }
            if ((iNumDigits >= 2) && (iNumDigits < 3))
            {
                return sResult = sResult + " трехзначное число";
            }
        }
        return "";
    }
}