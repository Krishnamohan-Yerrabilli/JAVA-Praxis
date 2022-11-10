package com.company;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[3];
        for (int row = 0; row < arr.length; row++) {
            arr[row] = in.nextInt();
        }

//        for (int row = 0;row < arr.length; row++)
        for (int a : arr){
            System.out.print(a + " ");
        }
    }
}
 
