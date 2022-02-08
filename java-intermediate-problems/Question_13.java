package com.company;
import java.util.Scanner;
public class Question_13  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many semesters you completely done : ");
        int sems = (int) in.nextDouble();
        double count = 0, sum = 0;
        System.out.println("Enter each individual semester marks : ");
        while (sems != 0) {
            int sem_marks = (int) in.nextDouble();
            sum = sum + sem_marks;
            count++;
            if (count == sems) {
                break;
            }
        }
        System.out.print("you're CGPA for overall semesters is : " + sum/count);
    }
}
