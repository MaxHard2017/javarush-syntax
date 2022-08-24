package level9.task0908;

/*
 *  Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
    String s = null;
    String m = s.toLowerCase();
    Требования:
    •    Программа должна выводить сообщение на экран.
    •    В программе должен быть блок try-catch.
    •    Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
    •    Выведенное сообщение должно содержать тип возникшего исключения.
    •    Имеющийся код в методе main не удалять.
 */
public class Solution {
    public static void main(String[] args) {
        try{
            // String s = null;
            // String m = s.toLowerCase();
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException has been caught!!!");
        }
    }
<<<<<<< HEAD
}
    
=======
}
>>>>>>> 561ba7f2dcb7767addf2bbc0ab2dd7222c324d6a
