package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Nathaniel Gibson
 */


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        //Gender Input
        System.out.print("Enter a 1 if you are male or a 2 if you are a female: ");
        int gender = scanner.nextInt();

        //Gender Sort
        double distRatio = 0;
        if(gender == 1) {
            distRatio = 0.73;
        } else if (gender == 2) {
            distRatio = 0.66;
        } else {
            System.out.println("Incorrect input given.");
        }

        //Alcohol Consumption and Weight Inputs
        System.out.print("How many ounces of alcohol did you have? ");
        int alc = scanner.nextInt();
        System.out.print("What is your weight, in pounds? ");
        int weight = scanner.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        int hours = scanner.nextInt();

        //Calculation
        double bloodAlc = (alc * 5.14 / weight * distRatio) - .015 * hours;

        //Output
        System.out.println("\nYour BAC is " + Math.round(bloodAlc * 1000000.0) / 1000000.0);
        if(bloodAlc > 0.08) {
            System.out.println("It is not legal for you to drive.");
        } else {
            System.out.println("It is legal for you to drive.");
        }

    }
}
