package edu.cscc;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // Title: smartphonePrices
    // Author: Ben Barksdale
    // Purpose: Prompts user to enter 10 smartphone prices, identifies and prints cheapest and most expensive phones

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] prices = new int[10];

        // Ask customer for ten smartphone prices

        System.out.println("Enter the price of 10 smartphones");
        System.out.println("");

        for (int i=0; i<=9; i++) {
            System.out.print("Enter price of phone " + (i+1) + ": ");
            prices[i] = input.nextInt();
        }

        // Sort the list of customer phone prices

        Arrays.sort(prices);

        // Print the three most expensive phones

        System.out.println("The three most expensive phones in your list are: ");

         for (int i=9; i>=7; i--) {
            System.out.println(prices[i] + "  ");
         }

         // Print the three cheapest phones

        System.out.println("The three cheapest phones in your list are: ");

         for (int i=0; i <=2; i++) {
             System.out.println(prices[i]);
         }
    }
}
