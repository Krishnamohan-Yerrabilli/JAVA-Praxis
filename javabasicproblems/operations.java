//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package com.company;

import java.util.Scanner;

public class operations {

    public static void main(String[] args) {
        Double a,b,result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        a = scan.nextDouble();//taking input of the first number
        System.out.println("Enter another number: ");
        b = scan.nextDouble();//taking input of the second number
        System.out.println("Enter which operation you want to perform (+,-,*,/): ");
        String operation = scan.next();
        scan.close();
        if (operation.equals("+")) {
            result = a + b; //Addition operation will be performed
            System.out.println("you choose addition so answer is : " + result);}
        else if (operation.equals("-")) {
            result = a - b; //Subtraction operation will be performed
            System.out.println("you choose subtraction so answer is : " + result);}
        else if (operation.equals("*")) {
            result = a * b; //Multiplication operation will be performed
            System.out.println("you choose multiplication so answer is : " + result);}
        else if (operation.equals("/")){
            result = a / b; //division operation will be performed
            System.out.println("you choose division so answer is : " + result);}
        else
            System.out.println("Please try again");//showing you not entered correct input according to the conditions
    }
}