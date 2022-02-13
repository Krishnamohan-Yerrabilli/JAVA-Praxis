// Write a function to check if a given triplet is a Pythagorean triplet or not.
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).


package com.company;

import java.util.Scanner;

public class Pythagorean_triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        triplet(in.nextInt(),in.nextInt(),in.nextInt());
    }

    static void triplet(int a, int b, int c){
        int a1,b2,c3,sum;
        a1 = a * a;
        b2 = b * b;
        c3 = c * c;
        sum = a1 + b2;
        if (sum == c3){
            System.out.println("This is an Pythagorean_triplet");
        } else {
            System.out.println("This is not an Pythagorean_triplet");
        }
    }
}
