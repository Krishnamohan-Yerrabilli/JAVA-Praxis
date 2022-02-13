package com.company;

import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fun(in.nextInt());
    }
    static void fun(int a){
        int result = a % 2;
        if (result == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
