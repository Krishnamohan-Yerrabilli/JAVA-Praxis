package com.company;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Taking input from the user
        System.out.println("Enter the world or phrase");
        System.out.println("-------------------------");
        String revstring = "", str = input.nextLine();//initializing variables
        int cal = str.length();//to count the length of the string

        //first we count string backwards and add that string in to revstring
        for (int i = (cal-1); i>=0; --i){
            revstring = revstring + str.charAt(i);
        }
        //if the original string (str) and revere string (revstring) both are matched together
        if (str.toLowerCase().equals(revstring.toLowerCase())){
            System.out.println("it is an palindrome");
        }
        //else we will print it's not a palindrome
        else{
            System.out.println("It's not an palindrome");
        }
    }
}