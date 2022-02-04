package com.company;

import java.util.Scanner;

public class Even_or_Odd {

    public static void main(String[] args) {

        System.out.println("To check whether the number is even or odd\nPlease Enter the number: ");
        Scanner input = new Scanner(System.in); //Taking the input from the user
        int num = input.nextInt(); // creating a variable (int num) and assigning to an input value
        int result = num%2; //Logic to find whether the number is Even or Odd

        //using if condition format
        if (result == 0){ // if condition is true then only it will go inside
            System.out.println("The number you entered " + num + "is Even"); // printing the statement on display
        }
        else{ // if condition is true then only it will go inside
            System.out.println("The number you entered " + num + "is Odd");  // printing the statement on display
        }

    }
}
