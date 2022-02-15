package com.company;

import java.util.Arrays;

/*
Var args is used for where the number of arguments are unknown and it's stored varibles arguments data in an array
and we can give types of varargs like we can give char vararg,string vararg,float vararg,and other types;
but don't forget the argumetns that we include so many it user choice
 */

public class Varargs {
    public static void main(String[] args) {
        multiplear(3, 4, "Kunal Kushwaha", "mohan", "vasudev", "Rahul");
    }

    static void multiplear(int a, int b, String... var) {
        System.out.println(a +  " " + b  + " " +  Arrays.toString(var));
        System.out.println(a + " " + b);
        System.out.println(Arrays.toString(var));
    }
}