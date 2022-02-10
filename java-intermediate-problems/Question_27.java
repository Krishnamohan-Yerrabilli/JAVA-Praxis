package com.company;

import java.util.Scanner;

public class Question_27 {
    public static void main(String[] args) {
        System.out.print("\nEnter Numbers\n");
        System.out.println("-------------");
        Scanner in = new Scanner(System.in);
        int sumn = 0,sume = 0,sumo = 0;
        while (true){
            int num = in.nextInt();
            if (num < 0){
                sumn = sumn + num;
            }if (num%2 == 0 && num > 0){
                sume = sume + num;
            }if (num%2 == 1 && num > 0){
                sumo = sumo + num;
            }if (num == 0){
                break;
            }
        }
        System.out.println("Sum of negative numbers equal to " + sumn );
        System.out.println("Sum of even numbers " + sume);
        System.out.println("Sum of odd numbers " + sumo);
    }
}
