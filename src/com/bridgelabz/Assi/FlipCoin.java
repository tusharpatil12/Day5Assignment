package com.bridgelabz.Assi;

import java.util.Scanner;

public class FlipCoin {
	
	public static void checkFlipCoin(int Head, int Tail, int Count) {
		
		double randomValue = 0.0;
		//System.out.println("please inter the number:");
		
        int flips = 1;
		while(Count <= flips) {
			
			randomValue =Math.random();
			System.out.print(Count+" "+randomValue);
			
			if (randomValue<0.5) {
				Head++;
				System.out.println(" heads ");
			}
			else {
				Tail++;
				System.out.println(" tail ");
				
			}
			Count++;
		}
		System.out.println();
		System.out.println("number of heads :"+Head);
		System.out.println("number of tail :"+Tail);
		
		double headPercent = (double)Head/flips+100;
		double tailPercent = (double)Tail/flips+100;
		
		System.out.println("Percentage of heads :" + headPercent);
		System.out.println("Percentage of tail :" + tailPercent);
		
}

	public static void main(String[] args) {
		checkFlipCoin(0,0,1);
		

	}

}
