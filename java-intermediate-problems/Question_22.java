package com.company;

import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {
        System.out.print("Enter a value : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print("Enter b value : ");
        int b = in.nextInt();
        int gcd = 1;
        for (int i = 1 ; i <= a && i <= b ; i++){
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        System.out.println("The hcf value is : " + gcd);
    }
}