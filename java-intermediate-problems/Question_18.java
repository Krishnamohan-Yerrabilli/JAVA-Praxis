package com.company;

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
//        System.out.print("Enter 1 to permutations (or) Enter 2 for combinations : ");
        double n, p, r, c, op, muln = 1, mulr = 1,mul = 1;
        System.out.print("if you choose P(permutations) press 1 or combinations for 2 : ");
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
//        double input = in.nextInt();
        System.out.print("Enter N value: ");
        n = in.nextInt();
        double dup = n;
        System.out.print("Enter R value: ");
        r = in.nextInt();
        if (c == 1){
            while(dup!=0){
                mul = mul * dup;
                dup--;
            }
            op = (n - r);
            while(op != 0){
                mulr = mulr * op;
                op--;
            }
            System.out.println(mul/mulr);
        } if (c == 2){
            while(dup!=0){
                mul = mul * dup;
                dup--;
            }
            double rcopy = r;
            while(rcopy != 0){
                muln = muln * rcopy;
                rcopy--;
            }
            op = (n - r);
            while(op != 0){
                mulr = mulr * op;
                op--;
            }
            System.out.println("The result of Ncr is " + (mul / (muln * mulr)));
        }
    }
}