//finding whether the given number is armstrong number or not in 3 digit case

package com.company;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//reading input from keyboard
        System.out.println("Enter a number ");
        System.out.println("--------------");
        int number = input.nextInt(),reminder,sum=0; //initializing variables
        int temp = number;//copy original number for doing operations
        //whole logic to find whether the number is armstrong or not
        while(number > 0) {
            reminder = number % 10;
            sum = sum + (reminder * reminder * reminder);
            number = number / 10;
        }
        if (temp == sum){//if original number is equal to sum then it is armstrong number
            System.out.println(temp + " is an armstrong number");
        }
        else{//else printing it is not an armstrong number
            System.out.println(temp + " is not an armstrong number");
        }
    }
}