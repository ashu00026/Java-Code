package org.example.DEmo;

public class Tricky {
    public static void main(String[] args) {
        boolean x=false;
        for(int i=0;i<6;i++){
            if(x){
                System.out.println("haveFun");
//                break;
            }
            x=!x;
        }

    }
}
