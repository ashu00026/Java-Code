package com.javaCollections;

import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap lhm=new LinkedHashMap();//insertion order is preserved here unlink the hashMap
        lhm.put(9,2);
        lhm.put(2,3);
        lhm.put(4,5);
        System.out.println(lhm);
    }
}
