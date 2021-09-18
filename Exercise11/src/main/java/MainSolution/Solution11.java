/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create a scanner inside a function that takes in input.
    -Use another function with the data to do the exchange math
        -In this function multiply euros by rate to find dollars
        -Then round dollars up to the nearest cent
    -Finally display that data in a single output statement

 */
package MainSolution;

import java.util.Scanner;
public class Solution11 {
    public static void main(String[] args) {

        input();
    }

    private static void input()
    {
        double euros, rate;
        Scanner in = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        euros = in.nextDouble();

        System.out.println("What is the exchange rate?");
        rate = in.nextDouble();

        convert(euros,rate);
    }

    private static void convert(double euros, double rate)
    {
        double dollars = euros * rate;

        dollars = dollars * 100;

        dollars = Math.ceil(dollars);

        dollars = dollars / 100;

        System.out.printf("%.2f euros at an exchange rate of %.4f is \n%.2f U.S. dollars.",euros,rate,dollars);



    }

}
