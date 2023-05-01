package edu.cscc;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

// Program Name: Calculate Total Cost
// Author: Ben Barksdale
// Purpose: Calculates total cost of items entered by a user, alongside the average cost


// Create a java program which will prompt a user to input a product and its cost.
// Using a while loop that will run until the sentinel value of “stop” (any case) is entered,
// the program will look for items with a cost greater than or equal to $100.00.
// The program will find the average cost of those items.

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String productName;
        int count;
        double productCost, total, average;

        // Print program title
        System.out.println("Products that cost $100.00 or more");


        // Prompt user to input a product and its cost

        count = 0;
        productName = "";
        total = 0;

        while (!((productName.equals("stop") || (productName.equals("Stop"))))) {
            System.out.print("Enter the name of a product - type 'stop' to end: ");

            productName = input.next();

            // Check for sentinel word (necessary to catch 'stop' on the first pass through the program)

            if (productName.equals("stop") || productName.equals("Stop")) {
                break;
            }

            // prompt user to enter cost
            System.out.print("Enter the cost of the product '" + productName + "': ");
            productCost = input.nextDouble();

            // validate that entered cost is greater than $100
            while (productCost < 100.0) {
                System.out.print("Invalid. Enter cost greater than $100.00.  ");
                productCost = input.nextDouble();
            }
            input.nextLine();

            // Increase total and count
            ++count;
            total = total + productCost;
        }

        // sets average to 0.00 if 'stop' entered on first loop through program
        // otherwise, average will display as NaN

        if (count == 0) {
            average = 0.00;
        } else {
            average = total / count;
        }

        // Prepare output report

        System.out.println("There were " + count + " items(s) that had a cost of $100.00 or more");
        System.out.println("The average price of items with a cost of $100.00 or more is $" + average);
        System.out.println("End of report");

    }
}