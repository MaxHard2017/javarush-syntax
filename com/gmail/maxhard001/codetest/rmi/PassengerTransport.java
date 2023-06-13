package com.gmail.maxhard001.codetest.rmi;

import java.io.IOException;

public abstract class PassengerTransport extends Vehicle{

    protected final int MAX_PASSANGERS;
    private String bussName;
    
    public PassengerTransport(String bussName, int maxPass) {
        super();
        this.MAX_PASSANGERS = maxPass;
        this.bussName = bussName;
    }
    public abstract void load() throws IOException;

    public abstract void unload();

    public abstract void talk();
    
    public abstract void control();
    
    public String getName() {
        return bussName;
    }        
}
