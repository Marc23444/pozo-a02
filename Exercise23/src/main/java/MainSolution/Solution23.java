/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create an input method with a scanner.
    -Create a tree of branching if statements and hold the users response in a string
    -All branches eventually lead to a final output statement.

 */

package MainSolution;

import java.util.Scanner;
public class Solution23 {
    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        Scanner in = new Scanner(System.in);
        String response;

        System.out.println("Is the car silent when you turn the key?");
        response = in.nextLine();
        if(response.equals("y"))
        {
            System.out.println("Are the battery terminals corroded?");
            response = in.nextLine();
            if(response.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else if (response.equals("n"))
            {
                System.out.println("Replace cables and try again.");
            }
        }
        else if (response.equals("n"))
        {
            System.out.println("Does the car make a slicking noise?");
            response = in.nextLine();
            if(response.equals("y"))
            {
                System.out.println("Replace the battery.");
            }
            else if (response.equals("n"))
            {
                System.out.println("Does the car crank up but fail to start?");
                response = in.nextLine();
                if(response.equals("y"))
                {
                    System.out.println("Check the spark plug connections.");
                }
                else if (response.equals("n"))
                {
                    System.out.println("Does the engine start then die?");
                    response = in.nextLine();
                    if(response.equals("y"))
                    {
                        System.out.println("Does your car have fuel injection?");
                        response = in.nextLine();
                        if(response.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                        }
                        else if (response.equals("n"))
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");

                        }
                    }
                    else if (response.equals("n"))
                    {
                        System.out.println("This should not be possible.");

                    }
                }
            }
        }


    }
}
