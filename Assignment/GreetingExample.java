package com.company;

import java.util.Scanner;

public class GreetingExample {

    public static void main(String[] args) {
      // Take input name from user and print greeting message
      
       Scanner input  =  new Scanner(System.in);
	     System.out.print("Enter your Name : ");
       String name = input.next();
       System.out.println("Hey "  + name + "!" + " How r u?");
    }
}
