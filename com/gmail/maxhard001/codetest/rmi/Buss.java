package com.gmail.maxhard001.codetest.rmi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Buss extends PassengerTransport {

    private List<Passenger> passangers;

    public Buss(String name, int maxPass) {
        super( name, maxPass );
        this.passangers = new ArrayList<>();
    }

    @Override
    public void load() throws IOException {
        try {
            for ( int i = 0 ; i < MAX_PASSANGERS - passangers.size(); i++) {
                passangers.add(Objects.requireNonNull(Passenger.getPassenger()));
            }
        } catch (NullPointerException e) {
            System.out.println("Осторожно, двери звкрываются!" );
        }
    }
    
    @Override
    public void unload() {
        if (passangers.size() > 0) {
            System.out.println(passangers.get(1).getName() + ": пропустите, выхожу.");
            passangers.remove(1);
        } else {
            System.out.println("а в автобусе никого и тихо, только мышки скребутся :)");
        }
    }

    @Override
    public void go() {
        if (this.getDriver() != null) {
            System.out.println("Дававй, машинист " + this.getDriver().getName() + " " + this.getName() + ", потихонечку трогай и песню свою не забудь!!!");
        } else {
            System.out.println("Водитель кобылы где-то курит...");
        }
    }

    @Override
    public void stop() {
        System.out.println("Держись, остановочка!!!");
    }
    @Override
    public void talk() {
        for (Social socialPassenger : passangers) {
            socialPassenger.introduce();
            socialPassenger.sayFrom();
            socialPassenger.sayAge();
        }
    }

    @Override
    public void control() {
        System.out.println("Ахтунг!!! Билетики!!!");

        for (Passenger passenger : passangers) {
            passenger.introduce();
            System.out.println("Есть билетик?");
            System.out.println( passenger.getTicketExist() == true ? " даа :)" : "неть:(") ;
        }
    }
}
