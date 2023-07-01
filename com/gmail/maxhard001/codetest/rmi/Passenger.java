package com.gmail.maxhard001.codetest.rmi;

import java.io.IOException;

public class Passenger extends Man {
    
    private boolean ticketExist; 
    public Passenger(String name, String city, int age) {
        super(name, city, age);
    }

    public static Passenger getPassenger() throws IOException {

        Man man = Man.getMan();
        Passenger newPassenger = new Passenger(man.getName(), man.getCity(), man.getAge());

        System.out.print("Билетик купил (true/fals)?");

        String str = (Math.random() * 10) > 5 ? "true" : "false";
        newPassenger.setTicketExist(Boolean.parseBoolean(str));
        System.out.println(str);
        return newPassenger;
        
    }
    

    public boolean getTicketExist() {
        return ticketExist;
    }

    public void setTicketExist(boolean ticketExist) {
        this.ticketExist = ticketExist;
    }
}