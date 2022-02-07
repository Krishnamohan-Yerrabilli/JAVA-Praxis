package com.company;

import java.util.Scanner;

public class Parameter_rectangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base of the Rectangle : ");
        double width = input.nextDouble();
        System.out.print("Enter a side of the Rectangle : ");
        double length = input.nextDouble();
        double perimeter = 2 * (width + length);
        System.out.println("Perimeter Of Rectangle is: " + (float)(perimeter));
    }
}