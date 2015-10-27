package com.satish.algorithms;

/**
 * Shortest path from start string to end string and every intermediate path should match dictionary.
 * @author satishkamavaram
 *
 */
public class Algorithm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runAlgorithm();
	}
	
	static String end = "cog";
	static String [] dictionary = new String []{ "hot","dot","dog","lot","log"};
	static int count;
	static String tem = "hit";

	private static void runAlgorithm()
	{
		String start = "hit";
		recurse(start.toCharArray(),0,start.length());
		System.out.println(count);
	}
	
	private static void recurse(char [] start,int index,int length)
	{
		if(index>=length)
		{
			if(new String(start).equals(tem))
				return;
			recurse(tem.toCharArray(),0,tem.length());
		}
		char temp= start[index];
		for(char c='a';c<'z';c++)
		{
			if(start[index]!=c)
			{
			   start[index]=c;
			   String intermediate = new String(start);
			   if(isAvailableInTarget(intermediate))
				   System.exit(0);
			}
		}
		start[index]= temp;
		index++;
		recurse(start,index,length);
	}


	private static boolean isAvailableInTarget(String intermediate)
	{
		if(end.equals(intermediate))
		{
			System.out.print(end);
			return true;
		}
		for(int i = 0;i<dictionary.length;i++)
		{
			if(dictionary[i]==null)
				continue;
			if(intermediate.equals(dictionary[i]))
			{
				tem = dictionary[i];
				count++;
				System.out.print(dictionary[i]+" -> ");
				dictionary[i] = null;
				return false;
			}
		}
		return false;
	}
}
