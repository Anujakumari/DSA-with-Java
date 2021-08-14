// Take in two numbers and an operator(+,-,*,/)  and calculate the value

package com.company;

import java.util.Scanner;

public class MathsOperation {
    public static void main(String[] args) {
        System.out.println("Take two numbers and an operator as input");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first num : ");
        float num1 = input.nextFloat();

        System.out.print("Enter second num : ");
        float num2 = input.nextFloat();

        System.out.print("Enter operator (+,-,*,/) : ");
        char operator = input.next().charAt(0);

        if (operator == '+' ){
            float sum = num1 + num2;
            System.out.println("Addition is : " + sum);
        } else if(operator == '-'){
            float sub = num1 - num2;
            System.out.println("Subtraction is : " + sub);
        } else if(operator == '*'){
            float multiply = num1 + num2;
            System.out.println("Multiplication is : " + multiply);
        } else if(operator == '/') {
            float div = num1/num2;
            System.out.println("Division is : " + div);
        } else {
            System.out.println("Please Enter '+', '-', '*'  & '/' operator only.");
        }
    }
}
