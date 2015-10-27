package com.satish.algorithms;

import java.util.Arrays;

/**
 * 
 * Given an array with 11110000 and convert it to 10101010 without using extra space.
 * 
 * @author satishkamavaram
 *
 */
public class Algorithm1 {

	public static void main(String[] args) {
		runAlgorithm();	
	}

	//
	private static void runAlgorithm()
	{
		int [] a = {'1','1','1','1','1','0','0','0','0','0'};
		int count=0;
		int length = a.length;
		int numberOfMovements = length/2-1;
		int tempCount = 0;
		for(int i = 0;i<length;i++)
		{
			if(i%2!=0)
			{  
				int tempMovement = numberOfMovements;
				int indexPosisitionOf0 = length/2+tempCount; 
			   	int temp = a[indexPosisitionOf0];
			   	while(tempMovement>0)
			   	{
			   		a[indexPosisitionOf0] = a[indexPosisitionOf0-1];
					indexPosisitionOf0--;
			   		tempMovement--;
			   	}
			   	a[count++] = temp;
			   	numberOfMovements--;
			   	tempCount++;
			}
			else
				a[count++] = a[i];
		}
		
		System.out.println(Arrays.toString(a).toString());
		
	}
}
