/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create a scanner inside of an input function
    -Prompt the user for the order amount
        -Ask the user what state they live in
        -If they live in Wisconsin or Illinois charge them tax
            -Prompt them for the county they live in
        -IF they live in any other state charge no tax
    -Calculate tax if needed
    -Display tax
 */
package MainSolution;

import java.util.Scanner;
public class Solution20 {
    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        Scanner in = new Scanner(System.in);
        double orderAmount,tax = 0;
        String state, county;

        System.out.println("What is the order amount?");
        orderAmount = Double.parseDouble(in.nextLine());

        System.out.println("What state do you live in?");
        state = in.nextLine();

        if(state.equals("Wisconsin"))
        {
            tax += orderAmount*.05;
            System.out.println("What county do you live in?");
            county = in.nextLine();
            if(county.equals("Eau Claire"))
            {
                tax+= orderAmount * .005;
            }
            else if(county.equals("Dunn"))
            {
                tax += orderAmount * .004;
            }
        }
        else if (state.equals("Illinois"))
        {
            tax+= orderAmount * .08;
        }


        System.out.printf("The tax is $%.2f.\nThe total is $%.2f",tax,(tax+orderAmount));


    }
}
