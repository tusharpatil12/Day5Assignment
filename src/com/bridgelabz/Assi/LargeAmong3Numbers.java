package com.bridgelabz.Assi;

public class LargeAmong3Numbers {
	
	public static void checkLargeNumber() {
		
		
		 int n1 = 10, n2 = 50, n3 = 20;

	        if( n1 >= n2 && n1 >= n3)
	            System.out.println(n1 + " is the largest number.");

	        else if (n2 >= n1 && n2 >= n3)
	            System.out.println(n2 + " is the largest number.");

	        else
	            System.out.println(n3 + " is the largest number.");
		
		
	}

	public static void main(String[] args) {
		checkLargeNumber();
	

	}

}
