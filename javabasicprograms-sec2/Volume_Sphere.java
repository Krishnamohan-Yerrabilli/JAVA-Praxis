package com.company;

import java.util.Scanner;

public class Volume_Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of sphere : ");
        double radius = input.nextDouble();
        double volume = (4.0/3.0) * 3.1419 * Math.pow(radius,3);
        System.out.println("Volume of the sphere is: " + (float)(volume));
    }
}