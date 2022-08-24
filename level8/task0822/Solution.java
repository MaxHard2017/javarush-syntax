package level8.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
Требования:
    •    Программа должна выводить текст на экран.
    •    Программа должна считывать значения с клавиатуры.
    •    Класс Solution должен содержать только три метода.
    •    Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
    •    Метод getMinimum() должен вернуть минимальное число среди элементов списка.
    •    Метод main() должен вызывать метод getIntegerList().
    •    Метод main() должен вызывать метод getMinimum().
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> intList = new ArrayList<Integer>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(read.readLine());
        for (int i = 0; i < count; i++) {
            intList.add(Integer.parseInt(read.readLine()));
        }
        return intList;
    }
}