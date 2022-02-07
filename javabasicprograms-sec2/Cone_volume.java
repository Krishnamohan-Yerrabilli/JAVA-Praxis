package com.company;

import java.util.Scanner;

public class Cone_volume{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cone : ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cone : ");
        double height = input.nextDouble();
        double parameter = 3.1415*Math.pow(radius,2)*height/3;
        System.out.println("Volume of the cone is: " + (float)(parameter));
    }
}