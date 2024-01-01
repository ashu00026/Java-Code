package com.javaCollections;

import java.util.Arrays;
import java.util.List;

public class demo2 {

    public static void main(String[] args) {
        int []a={8,1,4,9,2,3,6,1};
//        System.out.println(a);
        String [] x= {"ashu","arun","rahul","sohansh"};

        List<String> l=  Arrays.asList(x);

        Object[] array= l.toArray();

        for(Object i:array){
            System.out.println(i);
        }




//        l.add(String.valueOf(2));
//        for(int i:a){
//            l.add(i);
//        }
//        l.add("ashu");
//        Collections.addAll(l,a);
//        l.addAll(a);
        System.out.println(l);
//        System.out.println(c);
//        System.out.println(f);

    }
}
