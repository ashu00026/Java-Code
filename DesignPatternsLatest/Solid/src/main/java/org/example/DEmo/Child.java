package org.example.DEmo;

public class Child {
    public Child(){

    }
    public Identity child= new Identity();

    public Child withName(String name){
        child.name=name;
        return this;
    }

}
