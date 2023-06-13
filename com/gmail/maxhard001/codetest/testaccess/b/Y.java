package com.gmail.maxhard001.codetest.testaccess.b;

import com.gmail.maxhard001.codetest.testaccess.a.*;

public class Y extends X {


    public X doSmthng () {
        Y.y0 = 31;
        X x = new X();
        x.y1 = 101;

        return x;
    }

    public void change(X x) {
        Y y = new Y();
        y.y1 = 111;
        y.y3 = 333;
        x.y1 = 1111111;
        y.printXX();
    }

    public static void main(String[] args) {
        System.out.println(new X());
        Y y = new Y();
        X x9 = y.doSmthng();
        x9.y1 = 888;
       
        y.printXX();
        
        y.y1 = 1;
        y.y3 = 3;
        
        
        y.change(x9);
        System.out.println(Y.y0 + " " +  x9.y1 + " " + y.y1);
    }
}