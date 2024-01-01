package org.example.DEmo;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
//        Integer x= null;
//        System.out.println(x);
//        int y= Integer.parseInt(null);
        String myString = "aASHUTOSH PANIGRAHI";
        System.out.println('a'-'A');
        System.out.println(64-90);
        System.out.println((char)97);
        System.out.println((char)122);
        System.out.println(122-96);

        // Using getBytes without specifying character encoding
        byte[] bytesDefault = myString.getBytes();
        System.out.println("Bytes (Default Encoding): " + new String(bytesDefault));
        System.out.println("Bytes (Default Encoding): " + Arrays.toString(bytesDefault));

        // Using getBytes with UTF-8 character encoding
        byte[] bytesUTF8 = myString.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        System.out.println("Bytes (UTF-8 Encoding): " + new String(bytesUTF8, java.nio.charset.StandardCharsets.UTF_8));
        System.out.println("Bytes (UTF-8 Encoding): " + Arrays.toString(bytesUTF8));
    }
}
