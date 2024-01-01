package com.javaCollections;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.SortedMap;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {

//        TreeMap m = new TreeMap();
    TreeMap m = new TreeMap(new xyz());
//    SortedMap sm=new TreeMap();
//    TreeMap mx = new TreeMap(sm);
//    Map m4= new HashMap();
//    TreeMap mm1=new TreeMap(m4);

//        m.put(1,2);
//        m.put(2,3);
//        m.put(3,4);
//        m.put(4,5);

        //STRING1.compareTo(String2)-->this gives the reverse order of strings as +1 and accending order of strings as -1.!!!
//        for Strings
        m.put("ad",1);
        m.put("aa",2);
        m.put("ac",3);
        m.put("ab",4);

        System.out.println(m);

    }




}
