package com.company;

import java.util.Scanner;

public class Parallelogram_parameter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base of the Parallelogram Triangle : ");
        double base = input.nextDouble();
        System.out.print("Enter a side of the Parallelogram Triangle : ");
        double side = input.nextDouble();
        double perimeter = 2 * (base + side);
        System.out.println("perimeter of Parallelogram is: " + (float)(perimeter));
    }
}