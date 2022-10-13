package com.bridgelabz.Assi;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		double result = 0.0;
		for (int i =0; i > 0; i--) {
			result = result + (double) 1 /i;
		}
		System.out.println("Harmonic Number of "+ a +"+result");
	}

}
