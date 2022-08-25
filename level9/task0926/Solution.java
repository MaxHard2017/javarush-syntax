package level9.task0926;

import java.util.ArrayList;

/* 
    Создать список, элементами которого будут массивы чисел.
    Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
    Заполнить массивы любыми данными и вывести их на экран.
    Требования:
        •        Программа не должна считывать данные с клавиатуры.
        •        Метод createList должен объявлять и инициализировать переменную типа ArrayList<int[]>.
        •        Метод createList должен возвращать созданный список.
        •        Метод createList должен добавлять в список 5 элементов.
        •        Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2, следующих - 4, 7, 0 соответственно.
        •        Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.
*/
public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> iArrayList = new ArrayList<int[]>();
        int[] iArraySizes = new int[]{ 5, 2, 4, 7, 0 };     // определяет сколько массивов создадим и какого размера
        int[] iTempArray;                                   // временная переменная для гранения ссылки на создаваемый массив
        for (int size : iArraySizes) {
            iTempArray = new int[ size ];
            iArrayList.add( iTempArray );
            for (int i = 0; i < iTempArray.length; i++) {
                iTempArray[i] = (int)( Math.random() * 100 ); // делаем рандомный инт от 0 до 100000
            }
        }
        return iArrayList;
    }

    public static void printList( ArrayList<int[]> list ) {
        for ( int[] array : list ) {
            for (int x : array) {
                System.out.print( x + ", " );
            }
            System.out.println();
        }
    }
}