package com.rahul.ci;

public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("constructor :int , int");
    }

    public Addition(double a, double b){
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Constructor : double,double");
    }

    @Override
    public String toString() {
        return "Addition{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
