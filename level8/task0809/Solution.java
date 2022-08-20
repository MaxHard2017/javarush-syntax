package level8.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    /*
 * Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.
Требования:
    •    Программа должна выводить числа на экран.
    •    Метод main должен вызывать метод getInsertTimeInMs только два раза.
    •    Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
    •    Метод getInsertTimeInMs должен вызывать метод insert10000 только один раз.
    •    Метод getInsertTimeInMs должен вернуть время в миллисекундах, которое занимает 10 тысяч вставок в список.
 */
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList<Object>()));
        System.out.println(getInsertTimeInMs(new LinkedList<Object>()));
    }

    public static long getInsertTimeInMs(List<Object> list) {
        Date startTime = new Date();
        insert10000(list);
        Date endTime = new Date();
        long msWorkTime = endTime.getTime() - startTime.getTime();
        return msWorkTime;
    }

    public static void insert10000(List<Object> list) {
        for (int i = 0; i < 10000; i++) {
            list.add( 0, new Object());
        }
    }
}
