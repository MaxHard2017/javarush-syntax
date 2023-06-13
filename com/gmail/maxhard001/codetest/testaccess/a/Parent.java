package com.gmail.maxhard001.codetest.testaccess.a;

public abstract class Parent {
    interface Behaveour1 {
        abstract public void bh1();
        abstract public void bh1(int i);
        void bh1(char c);
       
        default public void run(int i) {
            System.out.println("default Behaveour1  run " + i + " meters");
        }
    }
    interface Behaveour2 {
        abstract public void bh1();
        default public void run() {
            System.out.println("default Behaveour2 run without stop!");
        }
    }

    private String secretParentName = null;
    public BehaveourImpl action;
        
    public abstract void represent();

    public Parent() {
        this.secretParentName = " secret Parent";
        this.action = new BehaveourImpl();

    }

    public String getSecretParentName() {
        return secretParentName;
    }

    public void shout() {
        System.out.println("The one and ever!!!");
    }

    public class BehaveourImpl implements Behaveour1,Behaveour2 {
        
        // @Override
        // public void run() {
        //     System.out.println("alternative run");
        // }
        
        @Override
        public void bh1(int i) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void bh1(char c) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void bh1() {
            // TODO Auto-generated method stub
            
        }


    }

}

