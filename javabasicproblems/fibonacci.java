package com.company;//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//reading input from the keyboard
        System.out.println("Enter the number: ");//displaying enter the number
        int a=0,b=1,c=0;// initialization of variables
        int n = input.nextInt();//taking input from the user and data info will be stored in n (pointing to the address of value in heap)
        for (int i = 2;i <= n;i++){//using for loop
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);//printing overall c value basically nth number value
    }
}