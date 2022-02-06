package com.company;

import java.util.Scanner;

public class Rhombus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the rhombus : ");
        double h_length = input.nextDouble();
        System.out.print("Enter the length of any_side of the rhombus : ");
        double anyside_length = input.nextDouble();
        double area = (h_length * anyside_length) / 2;
        System.out.println("Area of the rhombus is: " + (float)(area));
    }
}
