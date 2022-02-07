package com.company;

import java.util.Scanner;

public class Parameter_rhombus{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the Rhombus : ");
        double side = input.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Perimeter Of Rhombus is: " + (float)(perimeter));
    }
}