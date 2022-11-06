package com.company;

import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num % 4 == 0){
            System.out.println(num + " is an leap year");
        } else {
            System.out.println(num + " is not an leap year");
        }
    }
}
