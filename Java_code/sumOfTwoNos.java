package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);
        System.out.print("Enter First number ");
        int num1 = input.nextInt();
        System.out.print("Enter Second number ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " +sum);

    }
}
            
