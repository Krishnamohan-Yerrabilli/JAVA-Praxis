package com.company;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the Parallelogram : ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the Parallelogram : ");
        double height = input.nextDouble();
        double area = base * height;
        System.out.println("Area of a Parallelogram is: " + (float)(area));//to overcome floating point error
    }
}

