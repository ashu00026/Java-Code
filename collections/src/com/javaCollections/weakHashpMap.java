package com.javaCollections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class weakHashpMap {
    public static void main(String[] args) throws InterruptedException {
//        HashMap m= new HashMap();
//        Temp x= new Temp();
//        m.put(x,2);
//        System.out.println(m);
//
//        x=null;
//        System.gc();
//        Thread.sleep(3000);
//        System.out.println(m);

        WeakHashMap wm= new WeakHashMap();
        Temp x= new Temp();
        wm.put(x,2);
        System.out.println(wm);

        x=null;
        System.gc();
        //the Garbage collector always calls the finalize method before destroying an object..!!!
        Thread.sleep(3000);
        System.out.println(wm);

    }
}
