package org.example.DEmo;

import java.util.*;

class Base{
    public void print(){
        System.out.println("Base");
    }
    public void based(){
        System.out.println("based");
    }
}
class Derived extends Base{
    @Override
    public void print() {
        System.out.println("Derived");
    }
    public void derv(){
        System.out.println("derv");
    }
}

public class _Wrapper {
//    public static void doPrint(Base o){
//        o.print();
//    }
//    private static String $ ;
//    static {
//        System.out.println("block 1");
//    }
    public static void main(String[] args) {


//        String a_b;
//        System.out.print($);
//        int[] array = {6,9,8};
//        List<Integer> list = new ArrayList<>();
//        list.add(array[0]);
//        list.add(array[2]);
//        list.set(1, array[1]);
//        list.remove(0);
//        System.out.println(list);
//        char[] ca ={0x4e, '\u004e', 78};
//        System.out.println((ca[0] == ca[1]) + " "+ (ca[0] == ca[2]));
//        long longWithL = 1000*60*60*24*365L;
//        long longWithoutL = 1000*60*60*34*365;
//        System.out.println(longWithL);
//        System.out.println(longWithoutL);
//        String computerMove=null;
//        switch ( (int)(3*Math.random()) )
//        {
//            case 0:
//                computerMove = "Rock";
//                break;
//            case 1:
//                computerMove = "Scissors";
//                break;
//            case 2:
//                computerMove = "Paper";
//                break;
//        }
//        System.out.println("Computer's move is " + computerMove);
//        HashMap<String,String> map = new HashMap<String,String>(){
//            {
//                put("1", "ONE");
//            }{
//                put("2", "TWO");
//            }{
//                put("3", "THREE");
//            }
//        };
//        Set<String>stt=map.keySet();
//        Set<String>st=new HashSet<>();
//        for(Map.Entry entry:map.entrySet()){
//            System.out.println( entry.getValue());
////            st.add((String) entry.getValue());
//        }
//        for(String s:stt){
//            st.add(map.get(s));
//        }
//
//        for(String s:st){
//            System.out.println(s);
//        }
//        for(Map.Entry entry:map.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//        Set<String> keySet = map.keySet();
//        for (String string : keySet) {
//            System.out.println(string+" ->"+map.get(string));
//        }
//        System.out.println("MAin Mehtod!");
//        System.out.print(a_b);
//        String str="Java|Python|Hadoop";
//        String[] array = str.split("\\|");
//        System.out.println(Arrays.toString(array));
//        Object []x=new Object[5];
//        x[0]=new Integer(0);
//        System.out.println(x[0]);
//        System.out.println(Arrays.toString(x));
//        Integer num1=100;
//        Integer num2=10;
//
//        Integer num3=10;
//        Integer num4=10;
////        Integer num4=128;//-128 to 127
//        System.out.println(num1==num2);
//        System.out.println(num3==num4);
//        String s1="ashutoshaa";
//        char []charArr=s1.toCharArray();
//        Arrays.sort(charArr);
//        StringBuilder sb=new StringBuilder();
//        for(char ch:charArr){
//            sb.append(ch);
//        }
//        System.out.println(sb);
//        System.out.println(new String(charArr));
//        int []arr2={1,2,3,4,5};
//        System.out.println(Arrays.toString(arr2));
//        String arr[]={"ashu","12","11"};
//        System.out.println(Arrays.toString(arr));
//        Base x=new Base();
//        Base y= new Derived();
//        Derived z=new Derived();
//        doPrint(x);
//        doPrint(y);
//        doPrint(z);
    }
//    static {
//        System.out.println("block 2");
//    }
}
