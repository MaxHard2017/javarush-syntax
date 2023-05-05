package com.gmail.maxhard001.doggame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Dog {
    static final String CONSOLE_ENCODING = System.getProperty("console.encoding", "utf-8");
    //кодировку ввода с консоли берем из console.encoding

    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;
    boolean ready = false;

    public Dog(String name) {
        this.name = name;
        System.out.println("Гав! Я " + this.name + " я хочу гулять :)");
    }

    public class DogIsNotReadyException extends Exception {

        public DogIsNotReadyException(String message) {
            super(message);
        }
    }

    public void putCollar() {
        System.out.println("Одеваем ошейник...");
        this.isCollarPutOn = true;
    }
    

    public void putLeash() {
        System.out.println("Одеваем поводок...");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Одеваем намордник...");
        this.isMuzzlePutOn = true;
    }

    public void walk(Dog dog) throws DogIsNotReadyException {
        System.out.println("Мы можем пойти на прогулку?");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Да! Ура, идем гулять! " + name + " очень рад!");
            dog.ready = true;

        } else {
            throw new DogIsNotReadyException("Собака " + name + " не готова к прогулке! Проверьте экипировку :(");
        }
    }

    public void prepareDog(Dog dog) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, CONSOLE_ENCODING));
        System.out.println("Напиши что надо надеть, а потом напиши \"Гулять\" и побежали !!!!");
        String sAction = read.readLine();
        while ((!sAction.equals("Гулять")) && (!sAction.equals("гулять"))) {
            switch (sAction) {
                case ("ошейник"):
                    dog.putCollar();
                    break;
                case ("Ошейник"):
                    dog.putCollar();
                    break;
                case ("поводок"):
                    dog.putLeash();
                    break;
                case ("Поводок"):
                    dog.putLeash();
                    break;
                case ("намордник"):
                    dog.putMuzzle();
                    break;
                case ("Намордник"):
                    dog.putMuzzle();
                    break;
                default:
                    System.out.println(sAction + " не подойдет :(. Надо что-то, что я смогу надеть :)");
                    break;
            }

            sAction = read.readLine();
        }
    }

    
    public static void main(String[] args) throws IOException {
        System.out.print("\033[H\033[2J");

        // тестируем кодировку  file encoding: System.out, console - используем в System.in;
        System.out.println("1 console input encoding: " + CONSOLE_ENCODING);
        System.out.println("2 file encoding: " + System.getProperty("file.encoding"));
        System.out.println("3 default charset: " + Charset.defaultCharset().toString());

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in, CONSOLE_ENCODING));
        System.out.println("Напиши имя собачки: ");
        String dogName = read.readLine();
        System.out.print("\033[H\033[2J");
        Dog dog = new Dog(dogName);
        System.out.println("Хмм, надо что-то надеть... ");
        
        while(!dog.ready) {
            
            dog.prepareDog(dog);
            System.out.print("\033[H\033[2J");
            try {
                dog.walk(dog);
            } 
            catch (DogIsNotReadyException e) {
                System.out.println(e.getMessage());
                System.out.println("Проверяем снаряжение! \r\n - Ошейник надет? " + dog.isCollarPutOn + "\r\n - Поводок надет? "
                + dog.isLeashPutOn + "\r\n - Намордник надет? " + dog.isMuzzlePutOn);

            }
        }
    }
}