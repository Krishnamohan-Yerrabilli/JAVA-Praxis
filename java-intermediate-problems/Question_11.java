package com.company;
import java.util.Scanner;
public class Question_11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double input = in.nextInt();
        double power = Math.pow(input,2);
        System.out.print("The Power of " + (int)(input) + " is : " + (int)(power));
    }
}
