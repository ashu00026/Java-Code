package org.example.DEmo;

import java.util.Arrays;

public class MdArr {
    public static void main(String[] args) {
        int [][]arr = new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[6];
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<i+3;j++){
                arr[i][j]=9;
            }
        }
        for (int i = 0; i <3 ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


    }
}
