package com.company;

import java.util.Scanner;

public class Cylinder_volume{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder : ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cylinder : ");
        double height = input.nextDouble();
        double parameter = 3.1415*Math.pow(radius,2)*height;
        System.out.println("Volume of the Cylinder is: " + (float)(parameter));
    }
}