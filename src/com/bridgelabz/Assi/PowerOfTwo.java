package com.bridgelabz.Assi;

import java.util.Scanner;

public class PowerOfTwo {
	
	public static void checkPowerOfTwoNumbers(int i, int result) {
		//int i = 1;
		//int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number for power of 2 : ");
		int powerLines = scanner.nextInt();
		
		if(i > 0 && i < 31) {
			for( i = 1; i <= i; i++) {
				result = 2*i;
				System.out.println("2 + "+i+" ="+result);
			}
		
	}
		else 
			System.out.println("power must be in 0<power<31");
		
	
	}
		

	public static void main(String[] args) {
		checkPowerOfTwoNumbers(1,0);
	}

}
