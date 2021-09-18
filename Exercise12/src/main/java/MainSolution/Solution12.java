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
    and output the final interest and all other relevant data
 */

package MainSolution;

import java.util.Scanner;
public class Solution12 {
    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        Scanner in = new Scanner(System.in);
        //ROF = Rate of Interest
        double principle, ROF,years;
        System.out.println("Enter the principle: ");
        principle = in.nextDouble();

        System.out.println("Enter the rate of interest: ");
        ROF = in.nextDouble();
        ROF = ROF / 100;

        System.out.println("Enter the number of years: ");
        years = in.nextDouble();

        calculateInterest(principle,ROF,years);
    }

    private static void calculateInterest(double principle, double ROF, double years)
    {
        //A = P(1+rt)
        double interest =  principle * (1 + (ROF * years));

        //Rounds up fractional cents
        interest = interest * 100;
        interest = Math.ceil(interest);
        interest = interest /100;

        System.out.printf("After %.1f years at %c%.1f, the investment will be worth $%.2f",years,'%',ROF * 100,interest);


    }
}
