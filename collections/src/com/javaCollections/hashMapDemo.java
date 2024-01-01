package com.javaCollections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> marksMap= new HashMap<>();//intial capacity--16,load factor--0.75
//        Map map1= new HashMap();
//        HashMap map3= new HashMap(20);
//        HashMap map4= new HashMap(20,0.9f);//load factor an intial capacity changed
//        HashMap map5=new HashMap(map1);//pass any map into a hashMap through this constructor
//   hashmap has 4 compnents in its each node they are..NEXT,KEY,VALUE,HASHCODE

        marksMap.put("Science",90);
        marksMap.put("English",90);
        marksMap.put("Maths",80);
        marksMap.put("fb",10);
        marksMap.put("Science",10);//same value pairs are stored in the same index of the maps linked list
        System.out.println(marksMap.get("fb"));
        System.out.println(marksMap.keySet());
        System.out.println(marksMap.entrySet());
        System.out.println(marksMap.values());
        System.out.println(marksMap.clone());
        System.out.println(marksMap.containsKey("fb"));
        System.out.println(marksMap.hashCode());
        System.out.println(marksMap.size());
//        Hashtable a= new Hashtable();
//        a.
//

//        System.out.println(marksMap.remove("fb",10));//removes when the key and the value given is truly present in the map
        System.out.println(marksMap.computeIfAbsent("hello",k->1));//if the values are Integer values
//        System.out.println(marksMap.computeIfAbsent("hello",k->k+" basic Stronng"));//if the values are String values
        System.out.println(marksMap.computeIfPresent("English",(k,a)->1));
        System.out.println(marksMap);

    }
}
