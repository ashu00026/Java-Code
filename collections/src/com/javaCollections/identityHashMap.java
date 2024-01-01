package com.javaCollections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class identityHashMap {
    public static void main(String[] args) {
//        HashMap<Integer,String> hm=new HashMap<>();
//        hm.put(1,"ashu");
//        hm.put(1,"arun");
//        System.out.println(hm);
        IdentityHashMap<Integer,String>ihm=new IdentityHashMap<>();
        ihm.put(1,"ashu");
        ihm.put(1,"arun");
        System.out.println(ihm);
        //IdentityHashMap checks for key Values references while hashMap checks for their values.!!!
        //IdentityHashMap uses (= =) to check the keys ...and HashMap uses .equals method!!!
        IdentityHashMap<Integer,String>ihm2=new IdentityHashMap<>();
        Integer a= new Integer(1);
        Integer b= new Integer(1);
        ihm2.put(a,"ashu");
        ihm2.put(b,"arun");
//        System.out.println(ihm.get(1));
        System.out.println(ihm2);//here both the keys have same value (1) but have different references
    }
}
