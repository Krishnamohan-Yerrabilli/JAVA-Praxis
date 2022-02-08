
package com.company;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter How many numbers you want to find the average\n");
        int input = in.nextInt();
        System.out.print ("\nOk Input " + input + " numbers\n");
        int op = input;
        int count = 0,sum = 0,result = 0;
        while (input > count){
            op = in.nextInt();
            sum = sum + op;
            count ++;
        }
        result = sum / input;
        System.out.print("\nThe average of all the numbers is " + result);
    }
}
