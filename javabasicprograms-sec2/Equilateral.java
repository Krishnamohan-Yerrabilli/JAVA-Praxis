package com.company;

import java.util.Scanner;

public class Equilateral {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a side of the Equilateral Triangle : ");
        double a = input.nextDouble();
        double area = (1.73 * a * a) / 4;
        System.out.println("Area Of Equilateral Triangle is: " + (float)(area));
    }
}
