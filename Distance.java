/*
*Class: CS 5000/01
*Term: Fall 2020
*Name: Dayani Diaz 
*Instructor: Dr. Hisham Haddad
*Assignment: 1
IDE: Jgrasp
*/

import java.util.Scanner;  //import scanner class
class Distance
{
   public static void main(String args[]) //programs main method 
   
   {
      int x1,x2,y1,y2;
      
      double dis;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter x1 point"); //prompt user for input 
      
         x1=sc.nextInt();
         
         System.out.println("enter y1 point");
         
         y1=sc.nextInt();
         
      System.out.println("enter x2 point");
      
         x2=sc.nextInt();
      
      System.out.println("enter y2 point");
      
         y2=sc.nextInt();
         
         dis=Distance.calDis(x1,y1,x2,y2);
         
      System.out.println("distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" +dis);
      // print results 
         }
      
         static double calDis(int x1, int y1, int x2, int y2) //calculating distance 
         {
         return (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
         }
      
      }

      
      
      
      
      
      