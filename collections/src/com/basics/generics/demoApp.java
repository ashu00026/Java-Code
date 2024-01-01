package com.basics.generics;

public class demoApp {
    public static void main(String[] args) {
        data<String> d1=new data<>("ashutosh");
        System.out.println(d1);
        data<Integer> d2= new data<>(10);
        System.out.println(d2);
        IData<String> d3= new data("i am a good boy");
        System.out.println(d3.toString());
        IData<Integer> d4=new data(35);
        System.out.println(d4.getAns());
        System.out.println();
    }
}
