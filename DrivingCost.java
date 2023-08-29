/*
*Class: CS 5000/01
*Term: Fall 2020
*Name: Dayani Diaz 
*Instructor: Dr. Hisham Haddad
*Assignment: 1
IDE: Jgrasp
*/

import java.util.Scanner;  //import scanner class

public class DrivingCost 
{
	public static void main(String[] args) // program main method
   {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter input
		// efficiency of the car in miles and the price per gallon.
		System.out.print("Enter the driving distace: ");
		double distace = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();

		// Compute the cost 
		double costOfDriving = (distace / milesPerGallon) * pricePerGallon;

		// Print result
		System.out.println("The cost of driving is $" + costOfDriving);
	}
}

