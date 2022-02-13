/*

Write a program that will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as below:
        Marks        Grade
        91-100         AA
        81-90          AB
        71-80          BB
        61-70          BC
        51-60          CD
        41-50          DD
        <=40          Fail
*/

package com.company;

import java.util.Scanner;

public class Checkmarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        fun(a);
    }

    static void fun(int n){
        if(n >= 91 && n <= 100){
            System.out.println("AA");
        } if (n >= 81 && n <= 90){
            System.out.println("AB");
        } if (n >= 71 && n <= 80){
            System.out.println("BB");
        } if (n >= 61 && n <= 70){
            System.out.println("BC");
        } if (n >= 51 && n <= 60){
            System.out.println("CD");
        } if (n >= 42 && n <= 50) {
            System.out.println("DD");
        } if (n < 40){
            System.out.println("Fail");
        }
    }
}
