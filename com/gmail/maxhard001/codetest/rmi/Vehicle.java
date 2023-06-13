package com.gmail.maxhard001.codetest.rmi;

import java.io.IOException;

public abstract class Vehicle {

    private Man driver;

    public Man getDriver() {
        return this.driver;
    }
    public void setDriver(Man man) throws IOException {
        if (man.equals(null)) {
            man = Man.getMan();
        }
        this.driver = man;
        System.out.println("Водитель " + this.driver + " лезет за баранку");
    }
    public void removeDriver() {
        this.driver = null;
    }
        
    abstract public void go();

    abstract public void stop();

}
