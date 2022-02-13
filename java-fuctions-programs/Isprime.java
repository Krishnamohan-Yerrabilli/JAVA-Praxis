package com.company;

import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean result = fun(in.nextInt());
        System.out.println(result);
    }
    static boolean fun(int n){
        if (n < 1){
            return false;
        }
        int c = 2;
        while (c * c < n){
            if (n % c == 0) {
                return false;
            }c++;
        }return c * c > n;
    }
}
