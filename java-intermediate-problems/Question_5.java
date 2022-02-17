//Find the factorial of the number

package com.company;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the number:  ");
        double input = in.nextInt();
        double op = input;
        double mul = 1;

        for (double i = op; i >= 1 ; i--) {
            mul = mul * i;
        }

        System.out.println("\nThe factorial of the number " + (int)(input) + " is " + (int)(mul));
    }
}
