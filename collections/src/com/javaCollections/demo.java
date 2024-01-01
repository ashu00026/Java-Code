package com.javaCollections;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
//import java.util.Set;

public class demo {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(5);
        l.add(1);
        l.add(6);
        l.add(3);
        l.add(1);
        l.add(3);
        System.out.println(l);
//        l.sort();
        LinkedHashSet s=new LinkedHashSet(l);
        System.out.println(s);
    }
}
