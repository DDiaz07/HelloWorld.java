/*
*Class: CS 5000/01
*Term: Fall 2020
*Name: Dayani Diaz 
*Instructor: Dr. Hisham Haddad
*Assignment: 1
IDE: Jgrasp
*/

import java.util.Scanner;  //import scanner class

public class SumDigits
{
   public static void main(String[] Strings)  //program main method
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Input an integer between 0 and 9999: "); //prompt user input
      int num = input.nextInt();  // read user input
      
      int firstDigit = num % 10;
      int remainingNumber = num / 10;
      int SecondDigit = remainingNumber %10;
      remainingNumber = remainingNumber /10;
      int thirdDigit = remainingNumber %10;
      int fourthDigit = remainingNumber /10;
      int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
      System.out.println("The sum of all digits in " + num + " is " + sum); //print out message
      
   }  
}
