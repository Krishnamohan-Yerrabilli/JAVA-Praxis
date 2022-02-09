package com.company;
import java.util.Scanner;
public class Question_16  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to sum: : ");
        int numbers = (int) in.nextDouble();
        double count = 0, sum = 0;
        System.out.print("Enter the " + numbers + " Numbers : ");
        while (numbers != 0) {
            int ind_num = (int) in.nextDouble();
            sum = sum + ind_num;
            count++;
            if (count == numbers) {
                break;
            }
        }
        System.out.print("The sum is: " + sum);
    }
}