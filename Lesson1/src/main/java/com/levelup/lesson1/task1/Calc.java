package com.levelup.lesson1.task1;


public class Calc {
    private int a;
    private int b;
    static{
        System.out.println("start block");

    }


    public Calc() {

    }

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public long sum() {
        return a + b;
    }

    public double div() {
        return (double) a / (double) b;
    }

    @Override
    public String toString() {
        return "Calc{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        Calc calc= new Calc();
        System.out.println(calc);

        calc= new Calc(5,10);
        System.out.println(calc);

    }

}
