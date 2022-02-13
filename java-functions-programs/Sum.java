package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = fun(in.nextInt(), in.nextInt());
        System.out.println(result);
    }
    static int fun(int a, int b){
        return a + b;
    }
}
