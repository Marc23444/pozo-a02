/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Take in the length and width using a scanner in an input method.
    -Find the area of using the given length and width, this will be done
    in a separate area() function.
    -After finding the area take the modulus of the area with the paint constant.
    -If the modulus is greater than zero than add one to the area divided by the
    paint constant.
    -Return and display this result

 */

package MainSolution;

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        int L,W,area;
        Scanner in = new Scanner(System.in);

        System.out.println("Width?");
        W = Integer.parseInt(in.nextLine());

        System.out.println("Length?");
        L = Integer.parseInt(in.nextLine());

        area = findArea(L,W);
        calculatePaint(area);

    }

    private static int findArea(int L, int W)
    {
        return L * W;
    }
    private static void calculatePaint(int area)
    {
        final int conversion = 350;

        if(area % conversion == 0)
        {
            System.out.println("You will need to purchase "+area / conversion+ " gallons of paint to cover "+area+" square feet.");
        }
        else
        {
            System.out.println("You will need to purchase "+((area / conversion)+1)+ " gallons of paint to cover "+area+" square feet.");
        }

    }

}
