/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Like always start with an input function that creates a scanner
    and prompts the user for a number
    -Take this number the user entered and pass it through a function
        -This function will determine what month it is by using a
        switch statement
        -It will then return the month as a string
    -After the month is returned its displayed in a single output statement.
 */
package MainSolution;

import java.util.Scanner;
public class Solution21 {
    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        Scanner in = new Scanner(System.in);
        int month;

        System.out.println("Please enter the number of the month: ");
        month = Integer.parseInt(in.nextLine());

        System.out.println("The name of the month is "+findMonth(month));


    }
    private static String findMonth(int month)
    {
        return switch (month) {
            case 1 -> "January.";
            case 2 -> "February.";
            case 3 -> "March.";
            case 4 -> "April.";
            case 5 -> "May.";
            case 6 -> "June.";
            case 7 -> "July.";
            case 8 -> "August.";
            case 9 -> "September.";
            case 10 -> "October.";
            case 11 -> "November.";
            case 12 -> "December.";
            default -> "Invalid Number.";
        };

    }
}
