package level10.task1015;

import java.util.ArrayList;

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
