package com.company;

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String rev = "";
        for(int i = word.length() -1 ; i >= 0 ; --i){
            rev = rev + word.charAt(i);
        }
        System.out.println("Reverse of a string is : " + rev);
    }
}