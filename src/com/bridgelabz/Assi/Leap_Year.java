package com.bridgelabz.Assi;

import java.util.Scanner;

import javax.security.sasl.Sasl;

public class Leap_Year {
	
	public static void checkLeapYear(int Year) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year : ");
		int year = sc.nextInt();
		
		
		if((Year%4 == 0 && Year%100 != 0) || (Year%400 == 0))
			
		     System.out.println(Year + " is a leap year "); 
		
		else {
			
		     System.out.println(Year + " is not a leap year ");
		}
	
	}

	public static void main(String[] args) {
		System.out.println("welcome to leap year or not:");
		checkLeapYear(2000);
		checkLeapYear(1800);

	}

}
