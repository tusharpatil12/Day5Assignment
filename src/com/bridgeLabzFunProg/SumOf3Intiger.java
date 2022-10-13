package com.bridgeLabzFunProg;

import java.util.Arrays;

public class SumOf3Intiger {
	
	 static void findTriplets(int arr[], int n)
	    {
	        boolean found = false;
	 
	        Arrays.sort(arr);
	        
	        for (int i = 0; i < n - 1; i++) {
	            // initialize left and right
	            int l = i + 1;
	            int r = n - 1;
	            int x = arr[i];
	            while (l < r) {
	                if (x + arr[l] + arr[r] == 0) {
	                    // print elements if it's sum is zero
	                    System.out.print(x + " ");
	                    System.out.print(arr[l] + " ");
	                    System.out.println(arr[r] + " ");
	 
	                    l++;
	                    r--;
	                    found = true;
	                }
	 
	                // If sum of three elements is less
	                // than zero then increment in left
	                else if (x + arr[l] + arr[r] < 0)
	                    l++;
	 
	                // if sum is greater than zero then
	                // decrement in right side
	                else
	                    r--;
	            }
	        }
	 
	        if (found == false)
	            System.out.println(" No Triplet Found");
	    }
	
	

	public static void main(String[] args) {
		  int arr[] = { 0, -1, 2, -3, 1 };
	        int n = arr.length;
	        findTriplets(arr, n);
	    }

}
