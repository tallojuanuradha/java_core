package com.learning.core.day2session;

import java.util.Scanner;





public class D02P5_1 {
	public static void main(String args[])
	   {
	      String str, rev = "";
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	     
	      int length = str.length();
	      System.out.println("Length of the String is "+str.length());
	      System.out.println(" ");
	      System.out.println("UpperCase of the String is "+str.toUpperCase());
	      System.out.println(" ");
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a Palindrome");
	      else
	         System.out.println(str+" is not a Palindrome");
	      
	      sc.close();
	 
	   }


}