//Write a function to find if a number is a palindrome or not. Take number as parameter.

package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        palin(num);
    }

    static void palin(int num){
        String check = Integer.toString(num);
        String rev = "";

        while(num != 0){
            int revs = num % 10;
            rev = rev + Integer.toString(revs);
            num /= 10;
        }
        if (rev.equals(check)){
            System.out.println("It's an palindrome");
        } else {
            System.out.println("It's not an palindrome");
        }
    }
}
