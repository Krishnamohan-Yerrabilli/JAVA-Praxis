package com.company;

import java.util.Scanner;

public class simple_interest {

    public static void main(String[] args) {
        float principal, rate, time, simple_inter;//Creating variables
        Scanner scan = new Scanner(System.in); //Taking input
        System.out.print("Enter the Principal : ");
        principal = scan.nextFloat();//Assigning input to principal_amount
        System.out.print("Enter the Rate of interest : ");
        rate = scan.nextFloat();//Assigning input to rate
        System.out.print("Enter the Time period : ");
        time = scan.nextFloat();//Assigning input to time period
        scan.close();//Closing the scan usage
        simple_inter = (principal * rate * time) / 100; //Formula to find out simple_interest
        System.out.print("Simple Interest is: " + simple_inter);//Giving result in float
    }

}