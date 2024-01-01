package org.example.DEmo;

import java.util.HashMap;

public class Test {
    public int indexOfFirstNonRepeatingNumber(String s) {
        HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();
        for (char x : s.toCharArray()) {
            if (mpp.containsKey(x)) {
                mpp.put(x, mpp.get(x) + 1);
            } else {
                mpp.put(x, 1);
            }
        }
//        for (char x : s.toCharArray()) {
//            if (mpp.get(x) == 1) return s.indexOf(x);
//        }
        char [] charArr=s.toCharArray();
//        System.out.println(charArr[2]);
        for(int i=0;i<s.length();i++){
            if(mpp.get(charArr[i])==1)return i;
        }
        return -1;
    }
}
