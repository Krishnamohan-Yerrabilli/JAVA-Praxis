
package com.company;

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        //we are calculating in 2-d plane
        Scanner in = new Scanner(System.in);
        System.out.print("x1 : ");
        double x1 = in.nextInt();
        System.out.print("y1 : ");
        double y1 = in.nextInt();
        System.out.print("x2 : ");
        double x2 = in.nextInt();
        System.out.print("y2 : ");
        double y2 = in.nextInt();

        double x = x2-x1;
        double y = y2-y1;
        //d = √[(x2 − x1)2 + (y2 − y1)2]
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("The distance between two points is : " + (int)(distance) + " units");
    }
}
