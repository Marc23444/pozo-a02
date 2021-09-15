/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */

/*
    PSUEDOCODE
    -Create method to grab and return the current year using the clock
    -Create a method that prompts and takes input from the user
        -Will also calculate how many years until retirement and will return this
    -Display the output in main

*/


package MainSolution;

import java.util.Date;
import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {

        input();
    }

    static public int getYear()
    {
        Date date=new Date();
        int year =date.getYear();

        return year+1900;
    }
    static public void input()
    {
        Scanner input = new Scanner(System.in);
        int currentAge, retireAge;
        System.out.println("What is your current age?");
        currentAge = Integer.parseInt(input.nextLine());
        System.out.println("At what age would you like to retire?");
        retireAge = Integer.parseInt(input.nextLine());

        System.out.println("You have "+(retireAge-currentAge)+" years left until you can retire.");
        System.out.println("It's "+getYear()+", so you can retire in "+(getYear()+(retireAge-currentAge)));

    }

}
