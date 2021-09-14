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
        String strGender = scanner.next();

        //Confirm its numeric
        if(!strGender.matches("[0-9]+")) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        //Gender Sort
        int gender = Integer.parseInt(strGender);
        double distRatio = 0;
        if(gender == 1) {
            distRatio = 0.73;
        } else if (gender == 2) {
            distRatio = 0.66;
        } else {
            System.out.println("Incorrect input given.");
            System.exit(0);
        }

        //Alcohol Consumption and Weight Inputs
        System.out.print("How many ounces of alcohol did you have? ");
        String strAlc = scanner.next();
        System.out.print("What is your weight, in pounds? ");
        String strWeight = scanner.next();
        System.out.print("How many hours has it been since your last drink? ");
        String strHours = scanner.next();

        //Check if numerical
        if(!strAlc.matches("[0-9]+") || !strWeight.matches("[0-9]+")
                || !strHours.matches("[0-9]+")) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        //Parse Inputs
        int alc = Integer.parseInt(strAlc);
        int weight = Integer.parseInt(strWeight);
        int hours = Integer.parseInt(strHours);

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
