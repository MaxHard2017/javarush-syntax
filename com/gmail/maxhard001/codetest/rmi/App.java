package com.gmail.maxhard001.codetest.rmi;

import java.io.IOException;

public class App {
    
    public static void main(String[] args) throws IOException {
        Man sveta = new Man("Sveta", "Vasuki", 19);

        sveta.introduce();
        sveta.sayFrom();
        sveta.sayAge();

        Buss buss34 = new Buss("Автобус № 34", 10);

        buss34.setDriver(sveta);
        buss34.load();
        buss34.go();
        buss34.talk();
        buss34.control();
        buss34.unload();
        
    }
}