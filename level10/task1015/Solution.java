package level10.task1015;

import java.util.ArrayList;
/*
 * Создай массив, элементами которого будут списки строк.
Заполни массив любыми данными и выведи их на экран.
Требования: 
    •    Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
    •    Метод createList должен возвращать созданный массив.
    •    Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
    •    Программа должна выводить данные на экран.
    •    Метод main должен вызывать метод createList.
    •    Метод main должен вызывать метод printList.
 */
public class Solution {
    
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
       @SuppressWarnings("unchecked")           // закрываем сообщение 
        ArrayList<String>[] book = new ArrayList[5];
        
        for (int i = 0; i < book.length; i++){
            book[i] = new ArrayList<String>();
            book[i].add(Integer.toString(i));
            book[i].add ("one two three");
            book[i].add ("three two one");
        }
        return book;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }

    /*
     * реализация через список списков строк
   
      public static void main(String[] args) {
        ArrayList<ArrayList<String>> arrayOfStringList = createList();
        printList(arrayOfStringList);
    }
        
    public static ArrayList<ArrayList<String>> createList() {
        ArrayList<ArrayList<String>> book = new ArrayList<ArrayList<String>>();
        
        for (int i = 0; i < 5; i++){
            book.add(i, new ArrayList<String>());
            book.get(i).add(Integer.toString(i));
            book.get(i).add("one two three");
            book.get(i).add("three two one");
        }
        return book;
    }

    public static void printList(ArrayList<ArrayList<String>> arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) { // итерируемся по списку списков, получаем элемент - список строк
            for (String string : list) {                   // итерируемся по выбранному списку - получаем строку
                System.out.println(string);
            }
        }
    }
    */
}
