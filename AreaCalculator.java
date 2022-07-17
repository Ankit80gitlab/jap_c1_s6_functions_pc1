package com.jap.areacalculator;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option from list to calculate area of fence");
        System.out.println("1. Square area for the chickens");
        System.out.println("2. Circular area for ducks");
        System.out.println("3. Rectangular area for cows");
        System.out.println();
        // Input choice from user
        int choice = scanner.nextInt();

        // Make a call to calculateAreaOfFence(int choice) and pass the choice made by user to it

    }

    // Function to calculate area of fence by calling respective methods according to user's choice
    public static void calculateAreaOfFence(int choice) {
		Scanner sc=new Scanner(System.in);
		
		

		switch(choice)
		{
			case 1:
			double side=sc.nextDouble();
			double aOfSquare=calculateAreaOfSquare(side);
			break;

			case 2:
			double radius=sc.nextDouble();
			double aOfCircle=calculateAreaOfCircle(radius);
			break;

			case 3:
			double length=sc.nextDouble();
			double breadth=sc.nextDouble();
			double aOfRect=calculateAreaOfRectangle(length,breadth);
			break;

			default:
			System.out.println("Invalid input");
		}

    }

    // Function to calculate area of square
    public static double calculateAreaOfSquare(double side) {


		double aOfSquare=0.0;
		aOfSquare=(side*side);
        return aOfSquare;
    }

    // Function to calculate area of circle
    public static double calculateAreaOfCircle(double radius) {
		

		double aOfCircle=0.0;
		aOfCircle=(3.14*radius*radius);
        return aOfCircle;
    }

    // Function to calculate area of rectangle
    public static double calculateAreaOfRectangle(double length, double breadth) {
	

		double aOfRect=0.0;
		aOfRect=(length*breadth);
        return aOfRect;
    }
}

