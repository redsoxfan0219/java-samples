package edu.cscc;
import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class Main {

    // Author: Ben Barksdale
    // Date: April 30, 2023
    // Purpose of Program: Calculate Childcare Costs

    public static void main(String [] args){

        int[] agesOfChildren = getAgesOfChildren();
        int[] individualChildcareCosts = getChildcareCosts(agesOfChildren);
        int total = calculateTotalCosts(individualChildcareCosts);
        System.out.println("Total cost per week: $" + total);
    }

    private static int[] convertStringToIntegers(String userInput) {

        String[] stringArray = userInput.replaceAll("\\s", "").split(",");
        int[] integerArray = new int[stringArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = Integer.parseInt(stringArray[i]);
        }
        return integerArray;

    }

    private static int[] getChildcareCosts(int[] agesOfChildren) {

        int[] childcareCosts = new int[agesOfChildren.length];

        for (int i = 0; i < childcareCosts.length; i++) {
            int age = agesOfChildren[i];

            // weekly cost rates hardcoded

            if (age < 3) {
                childcareCosts[i] = 180;
            } else if (3 <= age && age <= 5) {
                childcareCosts[i] = 120;
            } else if (6 <= age && age <= 12) {
                childcareCosts[i] = 75;
            } else {
                System.out.println("Error: Age outside acceptable range");
            }
        }

        printWeeklyChildcareCosts(childcareCosts);
        return childcareCosts;
    }

    private static void printWeeklyChildcareCosts (int[] childcareCosts) {

        System.out.print("Cost per child per week: ");
        for (int i = 0; i < childcareCosts.length; i++) {
            if (i == childcareCosts.length - 1) {
                System.out.print("$" + childcareCosts[i]);
            } else {
                System.out.print("$" + childcareCosts[i] + ", ");
            }
        }
        System.out.println("");
    }

    private static int[] getAgesOfChildren() {

        System.out.println("Enter the ages of your children, separated by commas. Use whole numbers less than 13 (including 0, if applicable).");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        return convertStringToIntegers(userInput);
    }

    private static int calculateTotalCosts(int[] individualChildcareCosts) {

        int total = 0;
        for (int cost : individualChildcareCosts) {
            total += cost;
        }
        return total;
    }
}




