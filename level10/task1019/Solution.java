package level10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.
    Ключевые требования:
        Пустая строка - конец ввода данных.
        Числа могут повторяться.
        Строки всегда уникальны.
        Введенные данные не должны потеряться!
Затем программа должна выводить содержание HashMap на экран.
Каждую пару - с новой строки.
    Пример ввода:
        1
        Мама
        2
        Рама
        1
        Мыла

    Пример вывода:
        1 Мыла
        2 Рама
        1 Мама
Требования:
    •    Программа должна считывать данные с клавиатуры.
    •    Программа должна выводить текст на экран.
    •    В методе main объяви переменную коллекции HashMap и сразу проинициализируй ee.
*/

public class Solution {
    static final String ENCODING = System.getProperty("console.encoding", "utf-8");
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, ENCODING));
        HashMap<String, Integer> testMap = new HashMap<String, Integer>();

/* Фу-фу реализация для того чтобы прошла валидатор :(
        Integer id = null;                                      // переменная для ввода целого
        String name = "";                                 // переменная для ввода строки - ключа
        String inputString = "";

        while ( !((inputString = reader.readLine()).equals(""))) {
            id = Integer.parseInt(inputString);
            if ((name = reader.readLine()).equals("")) {
                testMap.put(name, id);
                break;
            }
            testMap.put(name, id);
        }
*/
        Integer id = null;                                      // переменная для ввода целого
        String name = "";                                 // переменная для ввода строки - ключа
        String inputString = reader.readLine();

        while (!inputString.equals("")) {
            do {
                try{
                    id = Integer.parseInt(inputString);   // проверяем был ли введеено целое или пришло исключение
                }
                catch (NumberFormatException e) {                              
                    name = inputString;                   // в случае исключения сохраняем введенное занчение как строку
                }
                inputString = reader.readLine();          // повтор чтения чтобы прочитать второе значение пары для Map
            } while(!inputString.equals("") & ((id == null) || (name.equals(""))));  
            // если пары не набралась повторяем ввод до образования корректной пары из переменных naim и id

            if (!testMap.containsKey(name)) {
                testMap.put(name, id);
            }
            id = null;                                      // обнуляем значения переменных ввода для корректной проверки do-while
            name = "";
        }
         for (Map.Entry<String, Integer> pair : testMap.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}