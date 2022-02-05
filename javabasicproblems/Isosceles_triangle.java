package com.company;

import java.util.Scanner;

public class Isosceles_triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the isosceles triangle : ");
        double base = input.nextFloat();
        System.out.print("Enter the height of the isosceles triangle : ");
        double height = input.nextFloat();
        double area = (base * height) / 2;
        System.out.println("Area of a isosceles triangle is: " + area);
    }
}
