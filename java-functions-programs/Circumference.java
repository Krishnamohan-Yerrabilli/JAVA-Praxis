package com.company;

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double result = fun(in.nextInt());
        System.out.print("The circumference of the circle is : " + (float)(result));
    }
    static double fun(double r){
        double c =  2 * 3.1415 * r;
        return c;
    }
}
