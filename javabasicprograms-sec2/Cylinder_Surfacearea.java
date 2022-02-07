package com.company;

import java.util.Scanner;

public class Cylinder_Surfacearea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder : ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cylinder : ");
        double height = input.nextDouble();
        double volume = 2 * 3.1415 * radius * height;
        System.out.println("Surface area of a Cylinder is: " + (float)(volume));
    }
}