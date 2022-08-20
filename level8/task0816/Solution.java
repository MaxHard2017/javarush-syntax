package level8.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
/*
 * Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
Требования:
    •    Программа не должна выводить текст на экран.
    •    Программа не должна считывать значения с клавиатуры.
    •    Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
    •    Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
 */
    public static Map<String, Date> createMap() throws ParseException {
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 10 2012"));
        map.put("Иванов", dateFormat.parse("APRIL 11 2012"));
        map.put("Сидоров", dateFormat.parse("JULY 21 2012"));
        map.put("Клинтон", dateFormat.parse("SEPTEMBER 16 2012"));
        map.put("Харвис", dateFormat.parse("AUGUST 1 2012"));
        map.put("Байден", dateFormat.parse("JUNE 12 2012"));
        map.put("Пелоси", dateFormat.parse("JULY 17 2012"));
        map.put("Шойгу", dateFormat.parse("AUGUST 13 2012"));
        map.put("Путин", dateFormat.parse("NOVEMBER 19 2012"));
        map.put("Зеленский", dateFormat.parse("MAY 15 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        
        Set<String> keysToDelete = new HashSet<String>();
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        Map.Entry<String, Date> entry;
        String key;
        Date value;

        while (iterator.hasNext()) {
            entry = iterator.next();
            key = entry.getKey();
            value = entry.getValue();

            if   ((value.after(dateFormat.parse("MAY 31 2012"))) 
                        & (value.before((dateFormat.parse("SEPTEMBER 1 2012"))))) {
                
                keysToDelete.add(key);
            }
        }   

        for (String item : keysToDelete) {
            map.remove(item);
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
    }
}