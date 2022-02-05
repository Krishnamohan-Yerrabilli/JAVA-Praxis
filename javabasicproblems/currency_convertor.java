//Input currency in rupees and output in USD.
package com.company;

import java.util.Scanner;

public class currency_convertor {

    public static void main(String[] args) {
        System.out.println("Enter currency exchange in rupees: ");
        Scanner input = new Scanner(System.in); //creating memory for input
        double ind = input.nextInt(); //assigning input for the ind variable
        double us = 0;
        us = ind * 0.013; //simple logic to calculate convention rate
        System.out.println("indian to us dollars of the given amount: " +  ind + " rupees is equal to " + us + " dollars"); //printing dollar rate in equal to indian rupees.
    }

}