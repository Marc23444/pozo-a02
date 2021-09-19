/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create a scanner inside of a method and use it to prompt for the users
    age
    -Create a string and set it based on weather the age is above or below 16.
        -Use a ternary operator to accomplish this
    -Display the output inside of the input() method
 */
package MainSolution;
import java.util.Scanner;
public class Solution16 {

    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        int age;
        Scanner in = new Scanner(System.in);

        System.out.println("What is your age?");
        age = Integer.parseInt(in.nextLine());

        String output = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(output);
    }

}
