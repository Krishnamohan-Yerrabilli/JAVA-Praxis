package com.company;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter principal amount (in rupees) : ");
        double pri_amo = in.nextDouble();
        System.out.print("Enter interest (in decimal): ");
        double inter = in.nextDouble();
        System.out.print("Enter how many years the amount will be compounded (2y-2y or 1y-1y): ");
        double com_plus = in.nextDouble();
        System.out.print("Enter how many years the money will be fixes? (5 years or 10 years): ");
        double period = in.nextDouble();
        double com_int = pri_amo * (1 + (inter/com_plus) * (period * com_plus));
        System.out.print("\nThe total amount you will get is : " + com_int + "rs\n");
    }
}
