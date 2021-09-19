/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Use an input method with a scanner to take in:
        -Gender (using 1 and 2)
        -OZ of alcohol
        -Weight in lbs
        -Hours since last drink
    -Bring all that data into a BAC calc function and compute the BAC
    -Return the BAC to the input function and print it
    -Finally determine if it is legal for the person to drive using
    a ternary operator

 */
package MainSolution;

import java.util.Scanner;
public class Solution17 {

    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        Scanner scan = new Scanner(System.in);
        int gender;
        double alcohol, weight,hours, BAC;

        System.out.println("Enter a 1 is you are male or a 2 if you are female:");
        gender = scan.nextInt();
        System.out.println("How many ounces of alcohol did you have?");
        alcohol = scan.nextDouble();
        System.out.println("What is your weight, in pounds?");
        weight = scan.nextDouble();
        System.out.println("How many hours has it been since your last drink?");
        hours = scan.nextDouble();

        BAC = calcBAC(gender,alcohol,weight,hours);

        System.out.printf("Your BAC is %.5f\n",BAC);

        String output = (BAC >= .08)? "It is not legal for you to drive." : "It is legal for you to drive.";

        System.out.println(output);
    }

    private static double calcBAC(int gender, double alcohol, double weight, double hours)
    {
        double BAC;
        if(gender == 1)
        {
            BAC = (alcohol * 5.14 / weight * .73) - .015 * hours;
            return BAC;
        }

        BAC = (alcohol * 5.14 / weight * .66) - .015 * hours;
        return BAC;

    }
}
