package com.company;

import java.util.Scanner;

public class greeting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Taking input from the user
        System.out.println("Enter you're name: ");//Asking to enter the name
        System.out.println("Hello " + input.nextLine() + ", I hope you have a great day.");//poping up the combined sentence
    }
}
