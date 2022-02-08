package com.company;
import java.util.Scanner;
public class Question_12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many runs batsman scored : ");
        double runs = in.nextInt();
        System.out.print("Enter how many times does batsman out : ");
        double out = in.nextInt();
        double result = runs/out;
        System.out.print("The batting average is " + result);
    }
}
