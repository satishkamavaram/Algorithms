package com.satish.algorithms;
/**
 * Finding all anagrams of a given word
 * @author satishkamavaram
 *
 */
public class Algorithm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runAlgorithm();
	}
	
	static int count;
	
	private static void runAlgorithm()
	{
		String start = "dog";
		recurse(start.toCharArray(),0,1,start.length());
	}
	
	private static void recurse(char [] c,int counter,int end,int length)
	{
		while(end<length)
		{
			swap(c,0,end);
			printWord(c);
			end++;
		}
		counter++;
		if(counter!=length)
			recurse(c,counter,1,length);
	}
	

	
	private static void swap(char [] c , int start,int end)
	{
		char temp = c[start];
		c[start] = c[end];
		c[end] = temp;	
	}
	
	
    
    private static void printWord(char [] c)
    {
    	for(int k = 0;k<c.length;k++)
    	{
    		System.out.print(c[k]);
    	}
    	System.out.println();
    }
    
}