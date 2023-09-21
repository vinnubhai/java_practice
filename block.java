package com.example.code;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class block {

    Scanner input = new Scanner(System.in);

    void campare () {

     int number1=25,output;

        System.out.println("enter a number : ");
     /*   number1 = input.nextInt();*/

        int a= number1 % 100;
        int e = a % 10;
        int l = a/10;
        int b = number1 / 100;
        int sum =  e + b + l;
        System.out.println("sum of "+number1+" is "+sum);
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);
        System.out.println(l);
      /*  System.out.println("input two numbers to campare them :");
        System.out.println("enter first number: ");
        int first_number = input.nextInt();

        System.out.println("enter second number: ");
        int second_number = input.nextInt();

        if (first_number == second_number)
            System.out.printf("%d == %d\n" , first_number , second_number );
        if (first_number != second_number)
            System.out.printf("%d != %d\n" , first_number , second_number );
        if (first_number < second_number)
            System.out.printf("%d < %d\n" , first_number , second_number );
        if (first_number > second_number)
            System.out.printf("%d > %d\n" , first_number , second_number );
        if (first_number <= second_number)
            System.out.printf("%d <= %d\n" , first_number , second_number );
        if (first_number >= second_number)
            System.out.printf("%d >= %d\n" , first_number , second_number );*/
         }
    }





