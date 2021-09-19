/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create a scanner object inside of an input function
    -Prompt the user for height in inches and weight in lbs
    -Use a BMI function to calculate the users BMI
        -Formula: bmi = (weight / (height × height)) * 703
        -18.5 - 25 Normal weight
        ->25 overweight
        -<18.5 underweight
    -Use another function to determine if the bmi is normal, over or under

 */
package MainSolution;

import java.util.Scanner;
public class Solution19 {
    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        Scanner in = new Scanner(System.in);
        double weight, height, BMI;

        System.out.println("Whats your weight in pounds?");
        weight = in.nextDouble();

        System.out.println("Whats your height in inches?");
        height = in.nextDouble();

        BMI = calcBMI(weight,height);

        System.out.printf("Your BMI is %.2f",BMI);
        System.out.println(bmiRange(BMI));

    }

    private static double calcBMI(double weight, double height)
    {
        //bmi = (weight / (height × height)) * 703
        return ((weight / (height * height)) * 703);
    }

    private static String bmiRange(double BMI)
    {
        /*
        -18.5 - 25 Normal weight
        ->25 overweight
        -<18.5 underweight
         */
        if(BMI >= 18.5 && BMI <= 25)
        {
            return "\nYou are within the ideal weight range.";
        }
        else if(BMI < 18.5)
        {
            return "\nYou are underweight. You should see a doctor.";
        }
        else if(BMI > 25)
        {
            return "\nYou are overweight. You should see a doctor.";
        }
        return "";
    }
}
