package level6.task0612;

public class Calculator {
    public static int plus(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a - b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return Math.multiplyExact(a, b);
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (double) a / b; // приведим делимое к вещественному double чтобы не было приведения результат деления к int
    }

    public static double percent(int iNumber, int iPersent) {
        //напишите тут ваш код
        return (double) (iNumber * iPersent) / 100; // приведим делимое к вещественному double чтобы не было приведения результат деления к int
    }

    
    
    public static void main(String[] args) {
        
    }
}
