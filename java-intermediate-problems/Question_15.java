package com.company;
import java.util.Scanner;
public class Question_15  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many subjects you have in this semester : ");
        int sems = (int) in.nextDouble();
        double count = 0, sum = 0;
        System.out.println("Enter each individual subject marks : ");
        while (sems != 0) {
            int sem_marks = (int) in.nextDouble();
            sum = sum + sem_marks;
            count++;
            if (count == sems) {
                break;
            }
        }
        System.out.print("your overall average for " + sems + " subjects is : " + sum/count);
    }
}