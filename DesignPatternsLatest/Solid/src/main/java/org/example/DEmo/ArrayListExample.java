package org.example.DEmo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(1);
        }
        for(int i=0;i<5;i++){
            System.out.print(list.get(i)+" ");
        }
        list.set(1,99);
        System.out.println();
        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(list[2]);
//        Math.max()
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
