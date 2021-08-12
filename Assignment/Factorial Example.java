package com.company;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);
        int i;
        int fact = 1;
        int num = input.nextInt();

        for(i=1; i<=num; i++){
            fact = fact*i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}