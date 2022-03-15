package com.company;

import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle : ");
        int width = input.nextInt();
        System.out.print("Enter the height  of the rectangle : ");
        int height = input.nextInt();
        double area = width * height;
        System.out.println("Area of a rectangle is: " + area);
    }
}
