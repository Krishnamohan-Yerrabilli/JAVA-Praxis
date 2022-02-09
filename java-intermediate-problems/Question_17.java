package com.company;
import java.util.Scanner;
public class Question_17  {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int op = num,sum = 0;

        while(op != 0) {
            int div = op % 10;
            int cal = (div * div * div);
            sum = sum + cal;
            op /= 10;
        }

        if (sum == num){
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("it's not an armstrong number");
        }
    }
}