//Take 2 numbers as input and print the largest number.

package com.company;

import java.util.Scanner;

public class comp_2_numbers {

    public static void main(String[] args) {
        Double a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = input.nextDouble();//Taking input of first number
        System.out.println("Enter second number : ");
        b = input.nextDouble();//Taking input of the second number
        System.out.println("After comparing the numbers the largest number is: ");
        if (a > b){ //if a is greater then b then print a
            System.out.println(a);
        }
        else{ //it's just saying if a is not the big number then b will be so print that.
            System.out.println(b);
        }
    }
}