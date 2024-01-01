package org.example.DEmo;

public class Mutable extends Immutable{

    public String name="panigrahi";

    public int age=29;

    @Override
    public void sayHello(){
        System.out.println("hello from subClass!!!");
    }
    public void greet(){
        System.out.println("good Evening!!");
    }
}
