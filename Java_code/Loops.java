package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // ***** For loop Example *****
      
      /*
            Syntax of for loops:
            for (initialisation; condition; increment/decrement) {
                // body
            }
        */

        // Q: Print numbers from 1 to 10
       for (int num = 1; num <= 10; num += 2) {
           System.out.println(num);
       }

 

        // ***** while loops Example *****
      
        /*
            Syntax:
            while (condition) {
                // body
            }
         */


        int num  = 1;
        while (num <= 10) {
            System.out.println(num);
            num += 1;
        }
      

        // ***** do while Example *****
      
        /*
             Syntax:
            do {
                // body
            } while (condition);
         */
      
      
        int n = 1;
        do {
            System.out.println("Hello");
            n++;
        } while (n != 1);

    }
}
