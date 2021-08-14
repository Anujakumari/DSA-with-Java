// Take 2 number as input and print the largest number

package com.company;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {

        // take 2 input and print the largest
        Scanner input = new Scanner(System.in);

        System.out.println(" Take 2 Numbers and alculate Largest number");

        System.out.print("Enter first number : ");
        float num1 = input.nextFloat();

        System.out.print("Enter second number : ");
        float num2 = input.nextFloat();

        if (num1>num2) {
            System.out.println(num1 + " is largest");
        } 
        else {
            System.out.println(num2 + " is largest" );
        }
    }
}
