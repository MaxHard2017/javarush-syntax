package com.gmail.maxhard001.codetest.testInitialization;


public class InitializationExample {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.toString());
    }
    static class Father {
        
        int nonStaticFather = 1;
        {
            System.out.println("Running Father non static block");
            nonStaticFather = 2;
            System.out.println("nonStaticFather == " + nonStaticFather);
        }

        static int staticFather0;
        static int staticFather1 = staticFather0 + 3;
        static int staticFather = 1;
        static {
            System.out.println("Running Father static block");
            System.out.println("staticFather0 == " + staticFather0);
            System.out.println("staticFather1 == " + staticFather1);
            System.out.println("staticFather == " + staticFather);
            staticFather = 2;
            System.out.println("staticFather == " + staticFather);
        }
        Father() {
            staticFather = 3; nonStaticFather = 3;
            System.out.println("Running Father constructor");
            System.out.println("staticFather == " + staticFather);
            System.out.println("nonStaticFather == " + nonStaticFather);
        }
    }

    static class Child extends Father {
        int nonStaticChild = 1;
        {
            System.out.println("Running Child non static block");
            nonStaticChild = 2;
            System.out.println("nonStaticChild == " + nonStaticChild);
        }

        static int staticChild = 1;
        static {
            System.out.println("Running Child static block");
            staticChild = 2;
            System.out.println("staticChild == " + staticChild);
        }

        Child() {
            staticChild = 3; nonStaticChild = 3;
            System.out.println("Running Child constructor");
            System.out.println("staticChild == " + staticChild);
            System.out.println("nonStaticChild == " + nonStaticChild);
        }
    }
}