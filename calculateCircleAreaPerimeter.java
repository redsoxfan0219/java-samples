package edu.cscc;
import java.util.Scanner;

// Program: calculateCircle
// Author: Ben Barksdale
// Purpose: Calculates area of a circle and perimeter. Radius provided via user input.

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double radius, area, perimeter;

        System.out.print("Enter the radius of your circle: ");

        radius = input.nextDouble();

        area = Math.PI * Math.pow(radius, 2);

        perimeter = 2 * Math.PI * radius;

        System.out.println("The area of a circle with radius " +radius+ " is " +area);
        System.out.println("The perimeter of a circle with radius " +radius+ " is " +perimeter);

    }
}
