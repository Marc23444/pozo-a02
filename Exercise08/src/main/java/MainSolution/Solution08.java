/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create a scanner inside of a function that will take in input.
    -After people, pizzas and number of slices for pizza are accounted for,
    multiply pizzas and number of slices in a seperate function.
    -In this same function take the number you got and modulus it by the number of people
    -Return the result and display the output accordingly

 */
package MainSolution;

import java.util.Scanner;
public class Solution08 {
    public static void main(String[] args) {

        input();
    }

    private static void input()
    {
        //SPP = Slices per pizza
        int people, pizzas,SPP,leftover;
        Scanner in = new Scanner(System.in);

        System.out.println("How many People?");
        people = Integer.parseInt(in.nextLine());

        System.out.println("How many pizzas do you have?");
        pizzas = Integer.parseInt(in.nextLine());

        System.out.println("How many slices per pizza?");
        SPP = Integer.parseInt(in.nextLine());

        leftover = pizzaCalc(people,pizzas,SPP);
        System.out.println(leftover+" pieces leftover.");
    }

    private static int pizzaCalc(int people, int pizzas, int SPP)
    {
        int totalSlices = pizzas * SPP;
        System.out.println(people+" people with "+pizzas+" pizzas ("+totalSlices+" slices)");

        System.out.println("Each person gets "+totalSlices / people+" pieces of pizza");
        return totalSlices % people;
    }
}
