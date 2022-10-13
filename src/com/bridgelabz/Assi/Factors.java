package com.bridgelabz.Assi;

public class Factors {
	
	public static void checkFactors(int number) {
		
		for (int i = 1; i<=number; i++) {
			while(number%i==0) {
				System.out.print(" "+i);
				number=number/i;
			}
		}
		if(number>2) {
			System.out.print(" "+number);
		}
		
	}

	public static void main(String[] args) {
		checkFactors(10);

	}

}
