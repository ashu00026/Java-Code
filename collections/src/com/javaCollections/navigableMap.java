package com.javaCollections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class navigableMap {
    public static void main(String[] args) {
        NavigableMap m= new TreeMap();
        m.put(2,102);
        m.put(7,107);
        m.put(9,109);
        m.put(4,104);
        m.put(1,101);
        m.put(5,105);
        m.put(3,103);
        m.put(8,108);
        m.put(6,106);
        System.out.println(m);

        System.out.println(m.ceilingEntry(0));
        System.out.println(m.ceilingKey(0));
        System.out.println("ashutosh "+m.floorEntry(10));
        System.out.println(m.floorKey(10));
        System.out.println(m.higherEntry(3));
        System.out.println(m.higherKey(3));
        System.out.println(m.lowerEntry(3));
        System.out.println(m.lowerKey(3));
        System.out.println(m.descendingKeySet());
        System.out.println(m.descendingMap());
        System.out.println(m.headMap(3));
        System.out.println(m.headMap(3,true));
        System.out.println(m.headMap(3));
        System.out.println(m.headMap(3,true));
        System.out.println(m.subMap(3,8));
        System.out.println(m.subMap(3,true,8,true));
        System.out.println(m.subMap(3,false,8,true));
        System.out.println(m.navigableKeySet());
        System.out.println(m.firstKey());
        System.out.println(m.firstEntry());
        System.out.println(m.lastKey());
        System.out.println(m.lastEntry());
    }
}
