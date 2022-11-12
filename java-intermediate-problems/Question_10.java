package com.company;
import java.util.Scanner;
public class Question_10 {
    public static void main(String[] args){
        // Calculate Commission Percentage
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of sales: ");
        double sales = in.nextInt(); 
        System.out.print("Enter commision percentage: ");
        double comper = in.nextInt();
        double commission = (comper/100) * sales;
        System.out.println("You're commission amount is " + commission);
    }
}
