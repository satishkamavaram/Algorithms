package com.satish.algorithms;
/**
 * Checks how many polindromes available in a given word./;;/"P;P;8R≥ º√ÇÎÏOPW09Q	0ol.:
 * @author satishkamavaram
 *
 */
public class Algorithm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runAlgorithm();
	}
	
	static int count;
	
	private static void runAlgorithm()
	{
		String start = "abba";
		recurse(start.toCharArray(),0,0,start.length());
		System.out.print("\ncount of polindromes : "+count);
	}
	
	private static void recurse(char [] c,int start,int end,int length)
	{
		if(end >= length)
		{
			if(start==length-1)
				return;
			start++;
			recurse(c,start,start,length);
		}
		else
		{
			isPolindrome(c,start,end,length);
			end++;
			recurse(c,start,end,length);
		}
	}

	
    private static void isPolindrome(char [] c,int start,int end,int length)
    {
    	int tstart = start;
    	int tend = end;
    	
       if(start!=end)
       {
    	   while(start<=end)
    	   {
    		   if(c[start]!=c[end])
    			   return ;
    	 	   start++;
    		   end--;
    	   }
       }
       count++;
	   System.out.print(new String(c,tstart,tend-tstart+1)+" -> ");
    }
	
}
