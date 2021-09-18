/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDO CODE
    -Create a scanner
    -Create a function that takes in input using the scanner
    -Calculate the area of the room in a function
    -Calculate the conversion in a function
    -Run all of these in main
 */

package MainSolution;

import java.util.Scanner;
public class Solution07 {


    public static void main(String[] args) {

        input();
    }
    public static void input()
    {
        double x,y,areaFeet, areaMeters;
        Scanner in = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        x = in.nextDouble();
        System.out.println("What is the width of the room in feet?");
        y = in.nextDouble();
        areaFeet = calculateArea(x,y);

        System.out.println("The area is\n"+areaFeet+" square feet");

        areaMeters = convertArea(areaFeet);

        System.out.printf("%.3f square meters",areaMeters);

    }

    private static double calculateArea(double x, double y)
    {
        return x * y;
    }

    private static double convertArea(double area)
    {
        final double conversion = 0.09290304;

        return area*conversion;
    }

}
