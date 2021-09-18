/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
        -Create a scanner inside of an input method
        -This scanner will take in:
        -Principal
        -Rate of interest
        -Number of years
    -Pass this data through another function which will calculate
    and output the final interest and all other relevant data using a formula
    -This formula has exponents so Math() functions will be needed.
 */
package MainSolution;

import java.util.Scanner;
public class Solution13 {
    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        Scanner in = new Scanner(System.in);

        //ROF = Rate of Interest
        double principle, ROF,years,yearlyCompounds;
        System.out.println("What is the principle?");
        principle = in.nextDouble();

        System.out.println("What is the rate of interest?");
        ROF = in.nextDouble();
        ROF = ROF / 100;

        System.out.println("What is the number of years?");
        years = in.nextDouble();

        System.out.println("What is the number of times the interest is compounded per year? ");
        yearlyCompounds = in.nextDouble();

        calculateInterest(principle,ROF,years,yearlyCompounds);
    }

    private static void calculateInterest(double principle, double ROF, double years, double yearlyCompounds)
    {
        double interest = principle * Math.pow(1+(ROF / yearlyCompounds),(yearlyCompounds*years));

        System.out.printf("$%.2f invested at %.1f%c for %.1f years compounded %.1f times per year is $%.2f. ",principle,ROF * 100,'%',years,yearlyCompounds,interest);

    }
}
