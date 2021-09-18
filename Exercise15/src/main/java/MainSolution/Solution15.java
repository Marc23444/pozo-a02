/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create a scanner and input method
    -Have the user enter a username and password, compare the password to some know
    password (ABC123)
    -If the password matches display welcome!, if not display i dont know you.


 */
package MainSolution;

import java.util.Scanner;
public class Solution15 {
    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        Scanner in = new Scanner(System.in);
        String user, pass;

        System.out.println("What is your username?");
        user = in.nextLine();

        System.out.println("Whats the password?");
        pass = in.nextLine();

        if(passwordCheck(pass))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
    private static boolean passwordCheck(String password)
    {
        String knownPass = "abc$123";
        if(password.equals(knownPass))
        {
            return true;
        }
        return false;
    }
}
