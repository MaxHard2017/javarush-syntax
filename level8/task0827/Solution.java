package level8.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/*
 * 1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.
            Пример:
            JANUARY 1 2000 = true
            JANUARY 2 2020 = false
            Требования:
    •    Программа должна выводить текст на экран.
    •    Класс Solution должен содержать два метода.
    •    Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
    •    Метод main() должен вызывать метод isDateOdd().
 */
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 2 2000"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Calendar currentDate = new GregorianCalendar();
        currentDate.setTime(dateFormatter.parse(date));

        int daysInYear = currentDate.get(Calendar.DAY_OF_YEAR);
        System.out.println(daysInYear);
        return (daysInYear % 2 != 0)? true : false;
    }
}
