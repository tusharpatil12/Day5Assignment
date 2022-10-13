package com.bridgelabz.Assi;

public class Swap_Two_Numbers {
	
	public static void checkSwap2Numbers(int A, int B, int temp) {
		
		int a=5;
		int b=10;
		int temp1=a;
		System.out.println("Befor Swaping: a="+a+"b="+b);
		
		a=a+b;
		b=a-b;
		a=a*b;
		
		System.out.println("After Swaping: a="+a+"b="+b);
		
	}

	public static void main(String[] args) {
		checkSwap2Numbers(10,20,30);
		

	}

}
