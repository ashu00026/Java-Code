package com;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcorentCollections extends Thread{
    public static ArrayList a=new ArrayList();

    public static void main(String[] args) {
        a.add("ashu");
        a.add("suman");
        a.add("karthiik");
        a.add("sourav");
        ConcorentCollections s= new ConcorentCollections();
        s.start();
        Iterator itr= a.iterator();
        while(itr.hasNext()){
           String name=(String) itr.next();
            System.out.println(name);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.getStackTrace();
            }
        }

    }
    public void run(){
        a.add("king");
        a.add("queen");
        a.add("jjack");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
