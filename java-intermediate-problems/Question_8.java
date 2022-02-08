
package com.company;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the original price of the product: \n");
        double orig = in.nextInt();
        System.out.print ("\nEnter how much discount you want to apply: \n");
        double disc = in.nextInt();
        double discal = orig * (disc/100);
        double result = orig - discal;
        System.out.println("\nCongratulations after applying " + (int)(disc) + "% discount to the product ");
        System.out.println("Now you only want to pay " + result + "rs");
    }
}
