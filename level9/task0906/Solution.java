package level9.task0906;

/*
 * Реализовать метод log.
Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
Имя класса, имя метода и сообщение разделить двоеточием с пробелом.

Пример вывода:
com.javarush.task.task09.task0906.Solution: main: In main method
Требования:
    •    Метод log должен выводить сообщение на экран.
    •    Выведенное сообщение должно содержать имя класса, метод которого вызвал метод log.
    •    Выведенное сообщение должно содержать имя метода, который вызвал метод log.
    •    Выведенное сообщение должно содержать переданное сообщение.
    •    Вывод должен соответствовать примеру из задания.
 */
public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {

        String sTrace = Thread.currentThread().getStackTrace()[2].getClassName();
        sTrace += ": ";
        sTrace += Thread.currentThread().getStackTrace()[2].getMethodName();
        sTrace += ": ";
        sTrace += text;
        System.out.println(sTrace);
    }
}