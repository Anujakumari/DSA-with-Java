package com.company;

import java.util.Scanner;

public class SimpleInterestEx {
    public static void main(String[] args) {

        // Calculate Simple Interest
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principle Amount(P) : ");
        float principle = input.nextFloat();

        System.out.print("Enter Rate(R) : ");
        float rate = input.nextFloat();

        System.out.print("Enter Time(T) : ");
        float time = input.nextFloat();

        float simple_interest = (principle * rate * time) / 100 ;
        System.out.println("Simple Interest is : " + simple_interest);

    }
}




