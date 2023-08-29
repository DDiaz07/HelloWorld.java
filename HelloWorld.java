/*
*Class: CS 5000/01
*Term: Fall 2020
*Name: Dayani Diaz 
*Instructor: Dr. Hisham Haddad
*Assignment: 1
IDE: Jgrasp
*/

import java.util.Scanner; //import scanner class

public class HelloWorld
{
   public static void main(String args[]) // program main method
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Please enter your name: "); //user input
      String name = s.nextLine(); // reading user input
      System.out.println("Hello" +" "+ name + "!");  //print 
   }
}
  
      