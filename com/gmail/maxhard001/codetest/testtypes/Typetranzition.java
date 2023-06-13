package com.gmail.maxhard001.codetest.testtypes;

public class Typetranzition {
    public static void main(String[] args) {
        print(((short) 1));
        print((Number) 1);
        print(1);
        print((Integer) 1);
        // print((int) 1);
    }

    public static void print(Integer i) {
        System.out.println("Это Integer I");
    }
    public static void print(Byte i) {
        System.out.println("Это byte");
    }

      public static void print(int i) {
          System.out.println("Это integer i");
      }

    // public static void print(Short i) {
    //     System.out.println("Это Short");
    // }
    //  public static void print(Number i) {
    //      System.out.println("Это Number");
    //  }

     public static void print(Object i) {
         System.out.println("Это Object");
     }

    // public static void print(double i) {
    //      System.out.println("Это double");
    // }

    public static void print(Double i) {
        System.out.println("Это Double");
    }

    // public static void print(float i) {
    //     System.out.println("Это float");
    // }
}
