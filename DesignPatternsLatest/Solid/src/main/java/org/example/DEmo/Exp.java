package org.example.DEmo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exp {
    static String findDuplicateEntries(String str){
        char[]charArr=str.toCharArray();
        Map<Character,Integer>mapp=new TreeMap<>();
        for(char ch:charArr){
            if(mapp.containsKey(ch)){
                mapp.put(ch,mapp.get(ch)+1);
            } else{
                mapp.put(ch,1);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry entry:mapp.entrySet()){
            if((int)entry.getValue()==1){
                sb.append((char)entry.getKey());
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        System.out.println(findDuplicateEntries("ashutosh"));
    }
}
