package com.gmail.maxhard001.codetest.testInitialization;


public class Animal {

    String brain = "Значение brain в классе Animal по-умолчанию";
    String heart = "Значение heart в классе Animal по-умолчанию";
 
    public static int animalCount = 7700000;

    public Animal() {
        System.out.println("constuctor class - Animal(default)");
    }
    public Animal(String brain, String heart) {
        System.out.println("Выполняется конструктор базового класса Animal");
        System.out.println("Были ли уже проинициализированы переменные класса Animal?");
        System.out.println("Текущее значение статической переменной animalCount = " + animalCount);
        System.out.println("Текущее значение brain в классе Animal = " + this.brain);
        System.out.println("Текущее значение heart в классе Animal = " + this.heart);
        System.out.println("Были ли уже проинициализированы переменные класса Cat?");
        System.out.println("Текущее значение статической переменной catsCount = " + Cat.catsCount);

        this.brain = brain;
        this.heart = heart;
        System.out.println("Текущее значение brain = " + this.brain);
        System.out.println("Текущее значение heart = " + this.heart);
        System.out.println("Конструктор базового класса Animal завершил работу!");

        animalCount++;
    }
    
 }
 
 class Cat extends Animal {

     String tail = "Значение tail в классе Cat по-умолчанию";

     static int catsCount = 37;

     public Cat(String brain, String heart, String tail) {
         super(brain, heart);
         System.out.println("Конструктор класса Cat начал работу (конструктор Animal уже был выполнен)");
         System.out.println("Текущее значение статической переменной catsCount = " + catsCount);
         System.out.println("Текущее значение tail = " + this.tail);
         this.tail = tail;
         System.out.println("Текущее значение tail = " + this.tail);
         catsCount++;
     }

     public static void main(String[] args) {
         Cat cat = new Cat("Мозг", "Сердце", "Хвост кота");
         System.out.println("Животных " + Animal.animalCount);
         System.out.println("Котов" + Cat.catsCount);
         System.out.println(cat);
        //  Scanner s = new Scanner(System.in);
     }

 }