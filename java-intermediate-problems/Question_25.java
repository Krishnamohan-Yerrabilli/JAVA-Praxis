package com.company;

import java.util.Scanner;

public class Question_25 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int op = n;
        int sum = 0,mul = 1;
        for (int i = 1; i < n ; i++){
            if(op%i == 0){
                sum = sum + i;
            }
        }
        if (sum == n){
            System.out.println(n + " is an perfect number");
        } else {
            System.out.println(n + " is not an perfect number");
        }
    }
}