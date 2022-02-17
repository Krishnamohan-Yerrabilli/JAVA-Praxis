package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_dimensional_array {
    public static void main(String[] args) {
        int[][] a = new int[3][2];
        Scanner in = new Scanner(System.in);

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = in.nextInt();
            }
        }

        for(int[] random : a){
            System.out.println(Arrays.toString(random));
        }

    }
}
