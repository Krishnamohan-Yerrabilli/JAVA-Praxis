//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package com.company;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int fact = in.nextInt(),sum = 0;
        while(fact != 0){

            int num = in.nextInt();
            sum = sum + num;

            if (num == 0){
                break;
            }
        }
        int result = sum + fact;
        System.out.println("\nThe sum of all above numbers is " + result);
    }
}