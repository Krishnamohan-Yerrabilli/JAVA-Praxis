package com.company;

import java.util.Scanner;

public class Circle_perimeter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double radius = input.nextDouble();
        double area = (2*3.14159*radius);
        System.out.print("perimeter (or) circumference of the circle is : " + (float)(area));
    }
}
