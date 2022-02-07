//Input a number and print all the factors of that number (use loops).

package com.company;

import java.util.Scanner;

public class Question_2{
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner in = new Scanner(System.in);
        int fact = in.nextInt();
        System.out.print("The factors of " + fact + " are : " );
        for (int i = 1; i <= fact; i++) {
            if (fact%i == 0){
                System.out.print(i + " ");
            }
        }

    }
}
