package level9.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
* Ввести с клавиатуры дату в формате "2013-08-18"
    Вывести на экран введенную дату в виде "AUG 18, 2013".
    Воспользоваться объектом Date и SimpleDateFormat.
    Требования:
        •        Программа должна считывать данные с клавиатуры.
        •        В программе должна быть объявлена переменная типа SimpleDateFormat.
        •        В программе должна быть объявлена переменная типа Date.
        •        Программа должна выводить данные на экран.
        •        Вывод должен соответствовать заданию.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String sInput = read.readLine();
        Date inputDate = inputDateFormat.parse(sInput);
        System.out.println(outputDateFormat.format(inputDate).toUpperCase());
    }
}