package com.company;

import java.util.Scanner;

public class areaofcircle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        int radius = input.nextInt();
        double area = 3.14159 * Math.pow(radius,2);
        System.out.println("Area of a circle is: " + area);
    }
}
