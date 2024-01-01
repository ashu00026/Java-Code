package org.example.DEmo;
import java.util.Random;

public class Sb {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        Random random=new Random();
        System.out.println((int)(random.nextFloat()*26));
        sb.append("weMakeDevs");
        System.out.println(sb);
        System.out.println((char)(97+25));
    }
}
