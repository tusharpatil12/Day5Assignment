package com.bridgelabz.Assi;

import java.util.Scanner;

public class Weather_Number {
	
	public static void checkEvenOrOdd(int Number) {
		
		if (Number % 2 == 0)
			System.out.println("Number is Even :"+Number);
		else
			System.out.println("Number is odd :"+Number);
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner("System.in");
		 System.out.println("checking whether the Number is Even or Odd:");
	        System.out.print("Enter a number: "); 
			checkEvenOrOdd(13);
			checkEvenOrOdd(12);


		
	}

}
