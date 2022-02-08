//Take two input's from the user and add them

package com.company;

import java.util.Scanner;

public class Sum_of_two_numbers {
    public static void main(String[] args) {
        System.out.print("\nEnter the first number : ");
        Scanner in = new Scanner(System.in);
        int input_1 = in.nextInt();
        System.out.print("Enter the second number : ");
        int input_2 = in.nextInt();
        int result = input_1 + input_2;
        System.out.println("\nThe Addition of two numbers : " + result);
    }
}
