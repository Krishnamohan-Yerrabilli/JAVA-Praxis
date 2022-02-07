package com.company;

import java.util.Scanner;

public class Parameter_square{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the square : ");
        double side = input.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Perimeter Of square is: " + (float)(perimeter));
    }
}