package com.satish.algorithms;

/**
 * Check if given string is polindrome or not
 * @author satishkamavaram
 *
 */
public class Algorithm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runAlgorithm();
	}
	
	private static void runAlgorithm()
	{
		String s = "mom";
		
		int start = 0;
		int end = s.length()-1;
		
		while(s.charAt(start)==s.charAt(end))
		{
			if(start>=end)
			{
				System.out.println("is polindrome");
				System.exit(-1);
			}
			start++;
			end--;
		}
		System.out.println("not a polindrome");
				
	}

}
