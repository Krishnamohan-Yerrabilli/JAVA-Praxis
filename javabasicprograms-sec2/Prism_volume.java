package com.company;

import java.util.Scanner;

public class Prism_volume{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width of prism : ");
        double width = input.nextDouble();
        System.out.print("Enter the length of the prism : ");
        double length = input.nextDouble();
        System.out.print("Enter the height of the prism : ");
        double height = input.nextDouble();
        double parameter = width * length * height;
        System.out.println("Volume of the prism is: " + (float)(parameter));
    }
}