package com.satish.algorithms;

/**
 * Given different coins in ATM machine. 
 * Provided total returns number of coins of each type.
 * @author satishkamavaram
 *
 */
public class Algorithm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runAlgorithm();
	}
	
	private static void runAlgorithm()
	{
		int total = 1060;
		int [] coins = new int []{50};
		int i =0;
		while(total>0 && i<coins.length)
		{
			int x = total/coins[i];
			System.out.println("total number of "+coins[i]+" is "+x);
			total = total%coins[i];
			i++;
		}
				
	}

}
