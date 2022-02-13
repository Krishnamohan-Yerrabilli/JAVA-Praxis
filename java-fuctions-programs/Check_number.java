package com.company;

import java.util.Scanner;

public class Check_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        fun(a = in.nextInt(), b = in.nextInt(), c = in.nextInt());
        int a1 = a;
        int b2 = b;
        int b3 = c;
        fun1(a1,b2,b3);
    }

    static void fun(int num1,int num2,int num3){
        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the biggest number");
        }else if (num2 > num3 && num2 > num1){
            System.out.println(num2 + " is the biggest number");
        }else {
            System.out.println(num3 + " is the biggest number");
        }
    }

    static void fun1(int num1,int num2,int num3){
        if (num1 < num2 && num1 < num3){
            System.out.println(num1 + " is the smallest number");
        }else if (num2 < num3 && num2 < num1){
            System.out.println(num2 + " is the smallest number");
        }else {
            System.out.println(num3 + " is the smallest number");
        }
    }

}



