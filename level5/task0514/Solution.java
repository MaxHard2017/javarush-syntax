package level5.task0514;

import com.gmail.maxhard001.crypto.Secure;

public class Solution
{
    static class Person
    {
        private String name;
        private int age;

        public void initialize (String name, int age)
        {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args)
    {   
        Person person = new Person();
        person.initialize("Muhamed", 30);
     
        System.out.println(person.name + " age: " + person.age);
        String s = Secure.encryptMessage("U+0400 — U+045F — буквы славянских алфавитов из кодировки ISO 8859-5, но перемещённые вверх на 864 позиции (36016).");
        System.out.println(s);
        s = Secure.decryptMessage(s);
        System.out.println(s);
    
 
        double amount = 1.00000005D;
        double avalue = 0.00000004D;
        double result = amount - avalue;
        System.out.println(result);

        String costForPrint = "2$";

        System.out.println( "Цена только для вас " + 
                - costForPrint.charAt(0) + getCurrencyName(costForPrint.charAt(1)));
        double i = (int) 1.0 * 0.15;
        System.out.println(i);
    }

    public static String getCurrencyName(char symbol) {
        if (symbol == '$') {
            return " долларов";
        } else {
            throw new UnsupportedOperationException("Not implemented yet");
        } 
    }

}