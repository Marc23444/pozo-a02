/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create a scanner and collect the output in a function
    -Push those numbers to a seperate function and calculate subtotal,tax and total
    -Then use another function to build the strings that will be displayed.
    -Finally send those strings to an output function to be displayed.
 */


package MainSolution;

import java.util.Scanner;
public class Solution10 {
    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        double item1Cost, item2Cost,item3Cost;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");
        item1Cost = in.nextDouble();
        System.out.println("Enter the quantity of item 1: ");
        item1Cost *= in.nextDouble();

        System.out.println("Enter the price of item 2: ");
        item2Cost = in.nextDouble();
        System.out.println("Enter the quantity of item 2: ");
        item2Cost *= in.nextDouble();

        System.out.println("Enter the price of item 3: ");
        item3Cost = in.nextDouble();
        System.out.println("Enter the quantity of item 3: ");
        item3Cost *= in.nextDouble();

        priceCalc(item1Cost,item2Cost,item3Cost);
    }

    private static void priceCalc(double cost1,double cost2, double cost3)
    {
        double subtotal,tax,total;

        subtotal = cost1 + cost2 + cost3;

        tax = subtotal * .055;

        total = subtotal + tax;

        stringCreation(subtotal,tax,total);
    }

    private static void stringCreation(double subtotal,double tax, double total)
    {
        String finalString = new String();

        finalString = "Subtotal: $"+subtotal+""+"\nTax: $"+tax+"\nTotal: $"+total;

        output(finalString);
    }
    private static void output(String output)
    {
        System.out.println(output);
    }
}
