package com.company;

import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        System.out.print("Enter the lum sum amount : ");
        Scanner in = new Scanner(System.in);
        double p = in.nextInt();
        System.out.print("Enter annual interest rate : ");
        double i = in.nextInt();
        System.out.print("Enter number of periods (years) interest held : ");
        double y = in.nextInt();
        double f = p * Math.pow((1+i/100),y);
        System.out.println("The future value would be for the given amount and period is : " + f);
    }
}