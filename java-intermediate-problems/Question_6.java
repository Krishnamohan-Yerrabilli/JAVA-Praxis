//Calcualate Electricity Bill
package com.company;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nWelcome to APCPDCL Portal\n");
        double mul = 0;
        System.out.println("\tAPCPDCL - Tariffs\n\tAs per Schedule\n\n\t0-50 kwh 2.65rs per unit\n\t51-100 kwh 3.35rs per unit\n\t101-200 kwh 5.4rs per unit\n\t201-250 kwt 6.38rs per unit\n\t251-300 kwh 6.88rs per unit\n\t301-400 kwh 7.38rs per unit\n\t301-400 kwh 7.38rs per unit\n\t401-500 kwh 7.88rs per unit\n\t500-Above kwh 10.22rs per unit\t");
        System.out.print("\n\nEnter how many units you used:  ");
        double input = in.nextInt();
        if (input > 0 && input <50){
            mul = input * 2.65;
        }if (input > 50 && input < 100){
            mul = input * 3.35;
        }if (input > 100 && input <200){
            mul = input * 5.4;
        }if (input > 201 && input < 250){
            mul = input * 6.38;
        }if (input > 251 && input < 300){
            mul = input * 6.88;
        }if (input > 301 && input < 400){
            mul = input * 7.38;
        }if (input > 401 && input <500){
            mul = input * 7.88;
        }if (input > 500) {
            mul = input * 10.22;
        }
        System.out.println("\nAmount you want to pay: " + (float)(mul));
        System.out.println("Bill status unpaid, Thank you for using APCPDCL");
    }
}
