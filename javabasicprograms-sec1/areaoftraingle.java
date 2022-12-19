package com.company;

import java.util.Scanner;

public class areaoftraingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the triangle : ");
        int base = input.nextInt();
        System.out.print("Enter the height of the triangle : ");
        int height = input.nextInt();
        double area = 0.5 * base * height;
        System.out.println("Area of a circle is going to be: " + area);
    }
}
