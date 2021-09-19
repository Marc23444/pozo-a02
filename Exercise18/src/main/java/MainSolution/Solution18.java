/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Take in input using a scanner
        -Prompt the user for F to C or C to F
        -Then ask for the temperature
    -A fahrenheit to celsius or a celsius to fahrenheit
    function will then be called passing through the
    given temperature.
    -This function will return the conversion to the
    input method where it will be output


 */
package MainSolution;

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        Scanner in = new Scanner(System.in);
        String choice;
        double temp;

        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                           "Press F to convert from Celsius to Fahrenheit. ");
        choice = in.nextLine();



        if(choice.equals("F") || choice.equals("f"))
        {
            System.out.println("Please enter the temperature in Celsius:");
            temp = in.nextDouble();
            temp = CtoF(temp);

            System.out.printf("The temperature in Fahrenheit is: %.2f",temp);
        }
        else if(choice.equals("C") || choice.equals("c"))
        {
            System.out.println("Please enter the temperature in Fahrenheit:");
            temp = in.nextDouble();
            temp = FtoC(temp);

            System.out.printf("The temperature in Celsius is: %.2f ",temp);

        }

    }
    private static double CtoF(double temp)
    {
        //F = (C × 9 / 5) + 32

        return (temp * 9 / 5) + 32;
    }

    private static double FtoC(double temp)
    {
        //C = (F − 32) × 5 / 9

        return (temp - 32) * 5 / 9;
    }
}
