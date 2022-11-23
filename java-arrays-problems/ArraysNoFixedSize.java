package com.company;

public class ArraysNoFixedSize {
    public static void main(String[] args) {
        int[][] arr = {
                {1},
                {4, 5, 6},
                {8, 9, 10, 11},
                {10, 2}
        };

        for(int row = 0; row < arr.length ; row++){
            for(int col = 0; col < arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }

            System.out.println();
        }
    }
}
