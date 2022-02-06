package com.company;

import java.util.Scanner;

public class Equilateral_perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a side of the Equilateral Triangle : ");
        double side = input.nextDouble();
        double perimeter = 3*side;
        System.out.println("perimeter of Equilateral Triangle is: " + (float)(perimeter));

    }
}