package org.example.DEmo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public static String readCookies(Cookie[]cookies){
//        System.out.println(cookies.length);
        if(cookies.length!=0){
            return Arrays.stream(cookies).map(c->c.getName()+"="+c.getValue()).collect(Collectors.joining(", "));
        }

        return "No Cookies";
    }


    public static void main(String[] args) {
        Cookie[] cookies=new Cookie[3];
        Cookie cookie1=new Cookie("ashutosh","backend");
        Cookie cookie2=new Cookie("arun","Fullstack");
        Cookie cookie3=new Cookie("sourav","frontEnd");
        cookie1.setMaxAge(60*60*24*7);//7days
        cookie2.setMaxAge(60*60*24);//1day
        cookie3.setMaxAge(60*60*24*7*30);//30days
        cookies[0]=cookie1;
        cookies[1]=cookie2;
        cookies[2]=cookie3;
        System.out.println(readCookies(cookies));



    }

}
