package com.gmail.maxhard001.codetest.rmi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Man implements Social {
    
    private String name;
    private String city;
    private int age;
    public Man( String name, String city, int age ) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    
    @Override
    public void introduce() {
        System.out.println( "Меня зовут " + this.name );
    }

    @Override
    public void sayAge() {
        System.out.println( "Я из города " + this.city );
    }
    
    @Override
    public void sayFrom() {
        System.out.println( "Мне " + this.age + " лет" );
    }
    
    public static Man getMan() throws IOException {
        String name = "";
        String city = "";
        String age  = "";

       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
                
            System.out.print("Имя: ");
            if ( (name = br.readLine()) == "" )  {
         
                return null;
            }
            
            System.out.print("Город: ");
            if (! (city = br.readLine()).equals("") ) {

            } else {
                return null;
            }

            System.out.print("Возраст: ");
            if ( !(age = br.readLine()).equals("") ) {

            } else {
                return null;
            }

       
        return new Man( name, city, Integer.parseInt( age ) );
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}