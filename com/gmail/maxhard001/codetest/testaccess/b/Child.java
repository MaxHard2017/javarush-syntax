package com.gmail.maxhard001.codetest.testaccess.b;
import com.gmail.maxhard001.codetest.testaccess.a.Parent;

public class Child extends Parent {
    static int countChilds = 0;
    
    private String name;
    private int countInLine;
    
    public String getName() {
        return name;
    }
    public int getCountInLine () {
        return countInLine;
    }


    @Override
    public void represent() {
        System.out.println("My name is: " + name);
    }
    public void represent(int i) {
        System.out.println("For real my name is: " + name + "-" + this.getCountInLine() + i);
    }
    
    public Child (){
        super();
        this.countInLine = ++countChilds;
        this.name = "Child of the Parent " + " " + this.countInLine;
    }
    
    public void shout(String s) {
        System.out.println("I am the " + s + "!!!");
    }

    public void run () {
        System.out.println("Child run");
    }


    public static void main(String[] args) {
        Child child = new Child();
        child.represent();
        System.out.println( child.getName() + "!!!");
        System.out.println("Parent secret name: " + child.getSecretParentName());
        child = new Child();

        child.represent();
        child.represent(4);
        child.shout();
        child.shout("Boss");
        child.run();
        child.action.run();
        child.action.run(10);
    }
}