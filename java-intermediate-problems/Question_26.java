package com.company;

import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 4 == 0){
            System.out.println(n + " is an leap year");
        } else {
            System.out.println(n + " is not an leap year");
        }
    }
}