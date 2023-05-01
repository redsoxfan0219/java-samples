package edu.cscc;
import java.util.Scanner;

public class Main {

    // Program Name: Calculate Total Cost
    // Author: Ben Barksdale
    // Purpose: Calculates total costs with shipping after user selects a shipping option

    private static Scanner input = new Scanner(System.in);

    private static boolean validate(int[] arr, int toCheckValue) {
        // test if the value is a member of the array

        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }

        return test;
    }


    public static void main(String[] args) {

        int shippingType;
        double shippingCost, productCost, totalCost;

        // Prompts users to enter product cost
        System.out.println("Shipping Costs");
        System.out.println("Enter the cost of the product ordered:");
        productCost= input.nextDouble();


        // Prompts user to select from shipping options

        System.out.println("Option 1: Standard shipping ($7.95)");
        System.out.println("Option 2:Express shipping ($13.95)");
        System.out.println("Option 3:Priority shipping ($23.95)");
        System.out.println("Enter your choice (1, 2, or 3):");
        shippingType = input.nextInt();

        // Validate user input

        int shippingOptions[] = {1, 2, 3};

        while (!(validate(shippingOptions, shippingType))) {
            System.out.println("Invalid option: Enter either 1, 2, or 3.");
            shippingType = input.nextInt();
        }

        // Set shipping cost based on selected option

        double STANDARD_SHIP = 7.95;
        double EXPRESS_SHIP = 13.95;
        double PRIORITY_SHIP = 23.95;

        if (shippingType == 1) {
            shippingCost = STANDARD_SHIP;
        }

        else if (shippingType == 2) {
            shippingCost = EXPRESS_SHIP;
        }

        else {
            shippingCost = PRIORITY_SHIP;
        }

        // Calculate and display total

        totalCost = shippingCost + productCost;

        System.out.println("The cost of the product is "
                            + productCost +
                            " plus shipping cost of " +
                            + shippingCost +
                            " equals " +
                            totalCost);

    }
}
