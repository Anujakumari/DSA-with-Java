package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	//for string

        Scanner input = new Scanner(System.in);
            String s = input.next();

        System.out.println(s);


	//for int

	Scanner input  =  new Scanner(System.in);
            int rollno = input.nextInt();

        System.out.println(rollno);

	//for float

	Scanner input  =  new Scanner(System.in);
            float marks = input.nextFloat();

        System.out.println(marks);

    }
}