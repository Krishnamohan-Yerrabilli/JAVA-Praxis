//Subtract the Product and Sum of Digits of an Integer

package com.company;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        System.out.print("\nEnter the number : ");
        Scanner in = new Scanner(System.in);//taking input from the user
        int user_in = in.nextInt();//storing the user input in the variable (user_in)
        int op = user_in;//for operations we copy the original value(user_in) and storing in the (op)
        String con = Integer.toString(op);//converting the user input to string for the later use
        int len = con.length();//finding the length of the string (which is user_in stored in con)
        int sum = 0,result,mul = 1;//initializing variables
        //using loop for the operations
        while(len >= 1){//this conditions will be true until we have length of the userinput is greater then or equal to 1
            op = user_in % 10;//by using this logic we get the last digit
            sum = sum + op;//the last digit is stored in sum for later loop sum all the digits for example input 234(2+3+4)sum = 9
            mul = mul * op;//the last digit is stored in mul for later loop multiply all the digits for example input 234(2*3*4)mul = 24
            user_in /= 10;//this updates the user_in value to remaining numbers only store integer not float value for example 234/10 = 23
            len--;//as the loop running the length of the string (original number) will be decreased
        }
        result = mul - sum; //result = multiplication - sum
        System.out.println("\nThe result of " + mul + " - " + sum + " = " + result);//printing the result
    }
}
