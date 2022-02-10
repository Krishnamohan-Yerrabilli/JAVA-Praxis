package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Question_24 {
    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int count = 0;
        String conv = a.toLowerCase(Locale.ROOT);
        for (int i = 0; i <= conv.length()-1; i++) {
            if (conv.charAt(i) == 'a' || conv.charAt(i) == 'e' || conv.charAt(i) == 'i' || conv.charAt(i) == 'o' || conv.charAt(i) == 'u') {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("it's an vowel");
        } else {
            System.out.println("it's an consonant");
        }
    }
}