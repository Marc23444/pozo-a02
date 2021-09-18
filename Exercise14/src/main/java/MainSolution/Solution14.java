/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create a function and scanner to take in both the price of the order
    and the state the user is in.
    -If the user is in WI, calculate and display the tax and update the ordertotal variable
    -Otherwise just output the order total without any additional calculations.
 */
package MainSolution;
import java.util.Scanner;
public class Solution14 {
    public static void main(String[] args) {
        input();
    }
    private static void input()
    {
        final double tax = .055;
        double orderAmount;
        String state;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the order amount?");
        orderAmount = Double.parseDouble(input.nextLine());

        System.out.println("What is the state?");
        state = input.nextLine();

        if(state.equals("WI"))
        {
            System.out.printf("The subtotal is $%.2f\n",orderAmount);
            System.out.printf("The tax is $%.2f\n",(orderAmount * tax));
            orderAmount = orderAmount + (orderAmount * tax);
        }

        orderAmount = orderAmount *100;

        orderAmount = Math.ceil(orderAmount);

        orderAmount = orderAmount / 100;

        System.out.printf("The total is $%.2f",orderAmount);


    }
}
