package com.company;

import java.util.Scanner;

public class Volume_Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of Pyramid : ");
        double length = input.nextDouble();
        System.out.print("Enter the width of Pyramid : ");
        double width = input.nextDouble();
        System.out.print("Enter the height of Pyramid : ");
        double height = input.nextDouble();
        double volume = (length * width * height) / 3;
        System.out.println("Volume of the Pyramid is: " + (float)(volume));
    }
}