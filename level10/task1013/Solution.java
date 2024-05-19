package level10.task1013;



/*
 *  Напиши класс Human с 6 полями.
    Придумай и реализуй 10 различных конструкторов для него.
    Требования:
        •    Программа не должна считывать данные с клавиатуры.
        •    В классе Human должно быть 6 полей.
        •    Все поля класса Human должны быть private.
        •    В классе Human должно быть 10 конструкторов.
        •    Все конструкторы класса Human должны быть public.
 */
public class Solution {
    public static class Human {
        private String name;
        private String secondName;
        private String middleName;
        private String address;
        private int age;
        private boolean sex;

        public Human(String name, String secondName, String middleName, String address, int age, boolean sex) {
            this.name = name;
            this.secondName = secondName;
            this.middleName = middleName;
            this.address = address;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String secondName, String middleName, String address, int age) {
            this.name = name;
            this.secondName = secondName;
            this.middleName = middleName;
            this.address = address;
            this.age = age;
            this.sex = true;
        }

        public Human(String name, String secondName, String middleName, String address, boolean sex) {
            this.name = name;
            this.secondName = secondName;
            this.middleName = middleName;
            this.address = address;
            this.age = 25;
            this.sex = sex;
        }

        public Human(String name, String secondName, String middleName, String address) {
            this.name = name;
            this.secondName = secondName;
            this.middleName = middleName;
            this.address = address;
            this.age = 25;
            this.sex = true;
        }

        public Human(String name, String secondName, String address, int age, boolean sex) {
            this.name = name;
            this.secondName = secondName;
            this.middleName = "";
            this.address = address;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String secondName, int age, boolean sex) {
            this.name = name;
            this.secondName = secondName;
            this.middleName = "";
            this.address = "homeless";
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String secondName, String address, boolean sex) {
            this.name = name;
            this.secondName = secondName;
            this.middleName = "";
            this.address = address;
            this.age = 25;
            this.sex = sex;
        }

        public Human(String name, String secondName, String address, int age) {
            this.name = name;
            this.secondName = secondName;
            this.middleName = "";
            this.address = address;
            this.age = age;
            this.sex = true;
        }

        public Human(String name, String secondName) {
            this.name = name;
            this.secondName = secondName;
            this.middleName = "";
            this.address = "homeless";
            this.age = 25;
            this.sex = true;
        }

        public Human() {
            this.name = "name";
            this.secondName = "secondName";
            this.middleName = "middleName";
            this.address = "address";
            this.age = 25;
            this.sex = true;
        }

        @Override
        public String toString() {
            StringBuffer sb = new StringBuffer();
            sb.append( super.toString() + "/n" );
            sb.append( this.name + ";");
            sb.append( this.middleName + ";" );
            sb.append( this.secondName + ";" );
            sb.append( this.address + ";" );
            sb.append( this.age + ";" );
            sb.append( this.sex + ";" );
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Human ham = new Human("Мя", "ов", "ныч", "faraway", 100, false);
        System.out.println(ham);
    }
}