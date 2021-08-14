// Input currency in rupee output in dollar

package com.company;

import java.util.Scanner;

public class RupeeToDollarEx {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter currency(in rupees) : ");
        float rupee = input.nextFloat();

        // To change rupee to dollar, just divide amount(in ruppee) by 74.2528(This is current value) .
        double dollar = rupee/74.1365;
        System.out.println("Currency in dollars is : " + dollar);
    }
}
