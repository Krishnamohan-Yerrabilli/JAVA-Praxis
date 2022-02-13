package com.company;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = Factorial(num);
        System.out.println("Factorial of " + num + " is : " + result);
    }

    static int Factorial(int num){
        int mul = 1;
        while (num >= 1){
            mul = mul * num;
            num--;
        }
        return mul;
    }
}
