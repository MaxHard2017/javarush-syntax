package com.gmail.maxhard001.codetest.testthread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreadExample extends Thread {
    public static void main(String[] args) throws InterruptedException, IOException {
        ThreadExample testThread = new ThreadExample();
        System.out.println(testThread.getState());
        testThread.start();
        testThread.join();
        System.out.println(testThread.getState());
    }

    @Override
    public void run(){
        for (int i = 0; i < 5
        ; i++) {
            System.out.print(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
        }
        
        try {new BufferedReader(new InputStreamReader(System.in)).readLine();} catch (IOException e) {}
    }
}