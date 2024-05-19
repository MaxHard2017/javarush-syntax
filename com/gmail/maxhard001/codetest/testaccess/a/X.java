package com.gmail.maxhard001.codetest.testaccess.a;

public class X {
    protected static Integer y0 = 1010;
    public Integer y1;
    Integer y2;
    protected Integer y3;
    
    protected void printXX() {
        System.out.println("Ok!!!");
    }

    public X() {
        this.y1 = -1;
        this.y2 = -2;
        this.y3 = -3;
    }

    public static void setY0(Integer y0) {
        X.y0 = y0;
    }

    public void setY1(Integer y1) {
        this.y1 = y1;
    }

    public void setY2(Integer y2) {
        this.y2 = y2;
    }

    public void setY3(Integer y3) {
        this.y3 = y3;
    }

    
    public class XX1 {
        int i = 1;
    }
    class XXX1 {
        int i = 2;
    }
    private class XY1 extends XX1 {
        int i = 3;
    }
    public static void main(String[] args) {
        System.out.println(new X().new XY1().i);
    }
    XX1 a = new XX1();


}

class XYY1 {
    int i = 5;
}

class XYY2 {
    public static void main(String[] args) {
        System.out.println(new X().new XX1().i);
    }
}
