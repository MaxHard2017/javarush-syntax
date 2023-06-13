package com.gmail.maxhard001.codetest.testconstslist;

public class TestDayOfWeek {

    public static void main(String[] args) {
        DayOfWeek day1 =  DayOfWeek.newDay("Cat");
        System.out.println("monday - " + DayOfWeek.MONDAY);
        System.out.println(day1);
        DayOfWeek.changeMonday("Dog");
        System.out.println("monday - " + DayOfWeek.MONDAY);
        
    }
}