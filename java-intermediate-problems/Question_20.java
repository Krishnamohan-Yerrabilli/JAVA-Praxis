package com.company;

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String rev = "";
        for(int i = word.length() -1 ; i >= 0 ; --i){
            rev = rev + word.charAt(i);
        }
        if (rev.equals(word)){
            System.out.println("it's an palindrome");
        } else {
            System.out.println("Its not an palindrome");
        }
    }
}