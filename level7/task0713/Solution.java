package level7.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
/*
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
Требования:

    Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
    Считать 20 чисел с клавиатуры и добавить их в главный список.
    Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
    Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
    Добавить в третий дополнительный список все остальные числа из главного.
    Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
    Программа должна вывести три дополнительных списка, используя метод printList.
*/    

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> iList = new ArrayList<Integer>();        // исходный список целых чисел
        ArrayList<Integer> iEven = new ArrayList<Integer>();        // список чесел делящихся на 2
        ArrayList<Integer> iTriple = new ArrayList<Integer>();      // список чесел делящихся на 3
        ArrayList<Integer> iOther = new ArrayList<Integer>();       // список остальных

        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        for (int i = 0; i < 20; i++) iList.add(Integer.parseInt(bufRead.readLine()));
        // читаем 20 строк с клавиатуры в список sList

  
        for (int i = 0; i < iList.size(); i++) {
            if (iList.get(i) % 3 == 0) iTriple.add(iList.get(i));
            if (iList.get(i) % 2 == 0) iEven.add(iList.get(i));
            if (!(iList.get(i) % 2 == 0) && !(iList.get(i) % 3 == 0)) iOther.add(iList.get(i));
        }

        System.out.println();
        printList(iTriple);
        System.out.println();
        printList(iEven);
        System.out.println();
        printList(iOther);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
