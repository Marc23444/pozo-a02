/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Use an input function with a scanner to prompt for and
     take in the 3 numbers
    -Pass these numbers through a separate function that will determine that all
    of the numbers are different
        -If they are return the largest number in the list
        -If not exit the program
    -Output the returned number
 */
package MainSolution;

import java.util.Scanner;
public class Solution22 {
    public static void main(String[] args) {
        input();
    }

    private static void input()
    {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];

        System.out.println("Enter the first number: ");
        nums[0] = Integer.parseInt(in.nextLine());

        System.out.println("Enter the second number: ");
        nums[1] = Integer.parseInt(in.nextLine());

        System.out.println("Enter the third number: ");
        nums[2] = Integer.parseInt(in.nextLine());

        if(checkEqual(nums))
        {
            System.out.println("The largest number is "+checkLargest(nums)+".");
        }
    }

    private static boolean checkEqual(int[] nums)
    {
        for (int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(nums[i] == nums[j] && i != j)
                {
                    return false;
                }
            }

        }
        return true;
    }

    private static int checkLargest(int[] nums)
    {
        int biggest = nums[0];
        for (int i = 1; i < 3; i++)
        {
            if(biggest < nums[i])
            {
                biggest = nums[i];
            }

        }
        return biggest;
    }

}
