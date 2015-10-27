package com.satish.algorithms;

import java.util.Arrays;

/**
 * 
 * Rotate a given array by k times.
 *
 * This solution is - O(n) , space - O(1)
 * @author satishkamavaram
 *
 */
public class Algorithm2 {

	public static void main(String[] args) {
		runAlgorithm();	
	}

	//
	private static void runAlgorithm()
	{
		int [] a = {'1','2','3','4','5','6','7'};
		int rotateBy = 3;
		System.out.println("input : "+Arrays.toString(a));
		
		
		rotateBy = rotateBy%a.length; //if rotateBy value is greater than arraylength.
		
		int b = a.length -rotateBy;
		
		reverseArray(a, 0, b-1);
		System.out.println("output : "+Arrays.toString(a));
		reverseArray(a, b, a.length-1);
		System.out.println("output : "+Arrays.toString(a));
		reverseArray(a, 0, a.length-1);
		
		System.out.println("output : "+Arrays.toString(a));
		
	}
	
	private static void reverseArray(int [] a , int left,int right)
	{
		if(a==null || a.length==1)
			return;
		while(left<right)
		{
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
	}
}
