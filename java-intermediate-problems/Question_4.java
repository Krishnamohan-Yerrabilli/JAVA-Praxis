//Take integer inputs till the user enters 0 and print the largest number from all.

package com.company;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        System.out.println("\nEnter the numbers \n");
        Scanner in = new Scanner(System.in);
        int input = 0,largest = 0;
        while((input = in.nextInt()) != 0 ){
            if (input > largest){
                largest = input;
            } if (input < largest){
                input = largest;
            }
        }
        System.out.println("\nThe largest number of given numbers is: " + largest);
    }
}