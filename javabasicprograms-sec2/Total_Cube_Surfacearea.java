package com.company;

import java.util.Scanner;

public class Total_Cube_Surfacearea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one of the side measurement of the cube : ");
        double side = input.nextDouble();
        double tsa = 6 * Math.pow(side,2);
        System.out.println("The total surface area of a cube is : " + (float)(tsa));
    }
}