
package com.company;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fun(in.nextInt());

    }
    static void fun(int a){
        if (a >= 18){
            System.out.println("Your Eligible to vote");
        } else {
            System.out.println("Your Not Eligible to vote");
        }
    }
}
