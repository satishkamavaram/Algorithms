/**
 * 
 */
package com.satish.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author satish.k
 *
 */
public class Algorithm {

	static int quickSortCounter= 0;
	
	Algorithm()
	{
		throw new NullPointerException();
	}
	
	void test()
	{
		System.out.println("test");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		/*factorial();
		System.out.println(factorialR(5));
		findingDuplicate();
		findingTotalNumberDuplicate();
		removeDuplicates();
		maximumSumInArray();
		System.out.println(reverseString("Satish"));
		bubbleSort();
		selectionSort();
		insertionSort();
		quickSort();
		binarySearch();*/
		//runLenghtEncodedString();
//		polindrome();
		//amstrong();
		//primeNumber();
		//fibonacciSeries(5);
		//swapNumbers();
		//convertDecimalToBinary();
	//	convertBinaryToDecimal();
		//convertDecimalToHEx();
		//printMaxTwoNumber();
		//moveSpacesInTheBeginning();
		//elimatePairsInTheString();
		//findDuplicate();
		//convertStringToNumber();
		//insertionSort();
		//testxor();
		//repeatDelete();
		//testing();
	//	elimatePairsInTheString();
		//quickSort();
		//maximumSumInArray();
	//	merge();
		//findFirstNonRepeatedCharacter();
		//findFirstnonRepeatedWord();
		//findFirstRepeatedWord();
		//findLengthOfStringWithoutlength();
		//permute("abc");
		//mergeTwoArray();
			
		//xor();
		runLenghtEncodedString();
	//removeDuplicates();
	//	maximumSumInArray();
		moveSpacesInTheBeginning();
	}
	
	static void xor()
	{
		int a  =10;
		int b = 15;
		System.out.println(a^b);
		char [] c = new char[1];
		if(c[0]=='0')
		System.out.println(c[0]);
	}
	
	static void mergeTwoArray()
	{
		int size = 3;
		int [] a = {9,10,11};
		int [] b = {12,19,20,0,0,0};
	
		int temp = 0;
		for(int i =0;i<a.length;i++)
		{
			while(true)
			{
				System.out.println(temp);
				if(a[i]<b[temp++])
				{
					int pos = temp-1;
					int n = size+i;
					while(pos<n)
					{
						  b[n] = b[n-1];
						  n--;
					}
					b[pos] = a[i];
					break;
				}
				else
				{
					if(temp==size+i)
					{
						b[temp]=a[i];
						break;
					}
				} 
			}
		}
		System.out.println(Arrays.toString(b));
		/*for(int i =0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}*/
	}
	
	static void shift(int [] b,int pos,int numberOfelements)
	{
	  while(pos<numberOfelements)
	  {
		  b[++pos] = b[pos];
	  }
	}
	
	static void permute( String input)
	{
	  int inputLength = input.length();
	  boolean[ ] used = new boolean[ inputLength ];
	  StringBuffer outputString = new StringBuffer();
	  char[ ] in = input.toCharArray( );
	  
	  doPermute ( in, outputString, used, inputLength, 0 );

	}

	  static void doPermute ( char[ ] in, StringBuffer outputString, 
	                    boolean[ ] used, int inputlength, int level)
	  {
	     if( level == inputlength) {
	     System.out.println ( outputString.toString()); 
	     return;
	     }

	    for( int i = 0; i < inputlength; ++i )
	    {       
	    	
	       if( used[i] ) continue;
	       System.out.println(in[i]);
	       outputString.append( in[i] );      
	       used[i] = true;       
	       doPermute( in,   outputString, used, inputlength, level + 1 );       
	       used[i] = false;       
	       System.out.println("sfdfsd");
	         outputString.setLength(   outputString.length() - 1 );   
	    }
	 }
	  
	  

	  static void findFirstnonRepeatedWord()
	{
		long startTime= System.currentTimeMillis();
		String s = "I Had had set set I Had had mdo";
		String [] sen = s.split(" ");
		
		String [] cs = new String[sen.length];
		String temp  = "-1";
		for(int i =0;i<sen.length;i++)
		{
			for(int j =0;j<cs.length;j++)
			{
				if(cs[j]!=null && cs[j].equals(temp))
					continue;
				if(cs[j]==null)
				{
					cs[j] = sen[i];
					break;
				}else if(cs[j].equals(sen[i]))
				{
					cs[j]= temp;
					break;
				}
		    }
		}
		
		for(int j =0;j<cs.length;j++)
		{
			if(!cs[j].equals(temp))
			{
				System.out.println(cs[j]);
				break;
			}
		}
		System.out.println(System.currentTimeMillis()-startTime);
		//firstNonRepeatedCharacter(s);
	}
	
	static void findLengthOfStringWithoutlength()
	{
		
		String s = "sdkfj";
		int i=0;
		try{
		for(i=0;;i++)
			s.charAt(i);
		}
		catch(StringIndexOutOfBoundsException aeo)
		{
			System.out.println(i);
		}
	}
	
	static void findFirstRepeatedWord()
	{
		long startTime= System.currentTimeMillis();
		String s = "I Had had set set I Had had mdo";
		String [] sen = s.split(" ");
		
		String [] cs = new String[sen.length];
		String temp  = "-1";
		boolean found = false;
		for(int i =0;i<sen.length;i++)
		{
			for(int j =0;j<cs.length;j++)
			{
				if(cs[j]!=null && cs[j].equals(temp))
					continue;
				if(cs[j]==null)
				{
					cs[j] = sen[i];
					break;
				}else if(cs[j].equals(sen[i]))
				{
					System.out.println(cs[j]);
					found= true;
					break;
				}
		    }
			if(found)
				break;
		}
		
		System.out.println(System.currentTimeMillis()-startTime);
		findFirstRepeatedWordcomplex(s);
	}
	
	static void findFirstRepeatedWordcomplex(String s)
	{
		long startTime= System.currentTimeMillis();
		//String s = "I Had had I set set I Had had mdo";
		String [] sen = s.split(" ");
		
		String [] cs = new String[sen.length];
		String temp  = "-1";
		boolean found = false;
		for(int i =0;i<sen.length;i++)
		{
			for(int j =i+1;j<sen.length;j++)
			{
				if(sen[j].equals(sen[i]))
				{
					System.out.println(sen[j]);
					found= true;
					break;
				}
		    }
			if(found)
				break;
		}
		
		System.out.println(System.currentTimeMillis()-startTime);
		//firstNonRepeatedCharacter(s);
	}
	
	static void findFirstNonRepeatedCharacter()
	{
		long startTime= System.currentTimeMillis();
		String s = "smdedsm";
		char [] cs = new char[s.length()];
		int temp  = -1;
		for(int i =0;i<s.length();i++)
		{
			for(int j =0;j<cs.length;j++)
			{
				if(cs[j]==temp)
					continue;
				if(cs[j]==s.charAt(i))
				{
					cs[j]= (char)temp;
					break;
				}
				else if(cs[j]==0)
				{
					cs[j] = s.charAt(i);
					break;
				}
		    }
		}
		
		for(int j =0;j<cs.length;j++)
		{
			if(cs[j]!=(char)temp)
			{
				System.out.println(cs[j]);
				break;
			}
		}
		System.out.println(System.currentTimeMillis()-startTime);
		firstNonRepeatedCharacter(s);
	}
	
	 public static void firstNonRepeatedCharacter(String str)
	    {
		 long startTime= System.currentTimeMillis();
	        HashMap<Character,Integer>  characterhashtable= 
	                     new HashMap<Character ,Integer>();
	        int i,length ;
	        Character c ;
	        length= str.length();  // Scan string and build hash table
	        for (i=0;i < length;i++)
	        {
	            c=str.charAt(i);
	            if(characterhashtable.containsKey(c))
	            {
	                // increment count corresponding to c
	                characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
	            }
	            else
	            {
	                characterhashtable.put( c , 1 ) ;
	            }
	        }
	        // Search characterhashtable in in order of string str
	        
	        for (i =0 ; i < length ; i++ )
	        {
	            c= str.charAt(i);
	            if( characterhashtable.get(c)  == 1 )
	            {
	            System.out.println(c);
	            break;
	            }
	        }
	      //  System.out.println("not found");
	        System.out.println(System.currentTimeMillis()-startTime);
	    }
	static void testing()
	{
		String a = "sdkjaaaabsc";
		
	}
	
	
	
	static void testxor()
	{
		int a = 5;
		int b = 6;
		int r ;
		int result = 0;
		int maxResult = 0;
		for(int i =a;i<=b;i++)
		{
			r = i;
			while(r<=b)
			{
				result = i^r;
				if(result >maxResult)
				{
					maxResult = result;
					
				}
				r++;
			}
		}
		System.out.println(maxResult);
	}
	
	static void repeatDelete()
	{
		String a = "AABBDDE";
		
		char [] c = a.toCharArray();
		
		char temp = c[0];
		int resultCount = 0;
		for(int i =1;i<c.length;i++)
		{
			if(temp==c[i])
			{
				resultCount++;
			}
			else
			{
				temp = c[i];
			}
		}
		System.out.println(resultCount);
	}
	static void convertStringToNumber()
	{
		String s = "11232";
		char [] ca = s.toCharArray();
		int sum = 0;
		 int zeroAscii = (int)'0';
		 System.out.println(zeroAscii);
		for(char c : ca)
		{
			int i = (int)c;
			sum = (sum*10)+(i-zeroAscii);
		}
		System.out.println(sum);
	}
	
	static void findDuplicate()
	{
		int sum = 60; //1..10
		int duplicate = 5;
		int highestNumber = 10;
		int duplicateNumber = sum - (highestNumber*(highestNumber+1)/2);
		System.out.println(duplicateNumber);
	}
	
	static void moveSpacesInTheBeginning()
	{
		String s ="move space to begining";
		char [] c = s.toCharArray(); 
		int count = s.length()-1;
		int n = count;
		for(int i =n;i>=0;i--)
		{
			if(c[i]!=' ')
				c[count--]=c[i];
		}
		
		while(count>=0)
			c[count--]='$';
		
		for(int i =0;i<c.length;i++)
			System.out.print(c[i]);
	}
	

	static void elimatePairsInTheString()
	{
		String s ="SSADDABB";
		
		char [] c = s.toCharArray();
		char temp = c[0];
		int count = 0;
		for(int i =0;i<c.length;i++)
		{
			if(i==0)
				continue;
			if(c[i]!=c[i-1])
			{
				c[count++] = temp;
				temp = c[i];
			}
		}
		c[count++] = temp;
		while(count<c.length)
			c[count++]=' ';
		System.out.println(c);
		
		//String s = "AAB";
		/*char [] c = s.toCharArray(); 
		char temp = c[0];
		int count =0;
		int tempCount = 0;
		for(int i =0;i<c.length;i++)
		{
			if(i==0)
				continue;
			if(temp==c[i])
			{
				tempCount++;
			}
			else
			{
				tempCount++;
				if(tempCount!=2)
				{
					c[count++] = temp;
				}
				temp = c[i];
				tempCount = 0;
			}
		}
		c[count++] = temp;
		
		for(int i =0;i<count;i++)
			System.out.print(c[i]);*/
	}
	
		static void convertDecimalToBinary()
		{
			int n = 25;
			int i = 0;
			while(n>0)
			{
				i = n%2;
				System.out.print(i);
				n = n/2;
			}
		}
	

	static void convertDecimalToHEx()
	{
		int n = 25;
		int i = 0;
		while(n>0)
		{
			i = n%16;
			System.out.print(i);
			n = n/16;
		}
	}
	
	static void convertDecimalToOct()
	{
		int n = 25;
		int i = 0;
		while(n>0)
		{
			i = n%8;
			System.out.print(i);
			n = n/8;
		}
	}
	
	
	static void convertBinaryToDecimal()
	{
		int n = 1010;
		int result = 0;
		int r = 0;
		int power = 0;
		while(n>0)
		{
			 r= n%10;		
			 result = result+r* (int)Math.pow(2, power);
			 power++;
			 n = n/10;
		}
		System.out.println(result);
	}
	
	static void primeNumber()
	{
		//number which is divisable by itself is prime number
		int n =1658;
		boolean flag = true;
		for(int i = 2;i<n;i++)
		{
			int j = n%i;
			if(j==0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(n +" is prime number");
		else
			System.out.println(n +" is not prime number");
	}
	
	
	static void fibonacciSeries(int n)
	{
		if(n==1)
		     return;
		int f1 =1;
		int f2 = 1;
		int f =0;
		System.out.print(f1+" "+f2+" ");
		for(int i=2;i<n;i++)
		{
			f = f1+f2;
			System.out.print(f+" ");
			f1= f2;
			f2 = f;
		}
	}
	
	static void swapNumbers()
	{
		int a = 44;
		int b = 65;
		b = a+b;
		a = b - a;
		b = b-a;
		System.out.println(a+ " "+b);
		
		
	}
	
	static void polindrome()
	{
		int n = 153;
		int result = 0;
		while(n!=0)
		{
			result = result*10;
			result = result + n%10;
			n = n/10;
		}
		System.out.println(result);
	}
	
	static void amstrong()
	{
		int n = 153;
		int result = 0;
		int r = 0;
		while(n!=0)
		{
			r =n%10;
			result = r*r*r+result;
			n = n/10;
		}
		System.out.println(result);
	}
	static void factorial()
	{
		int n =5;
		int f = 1;
		for(int i=n;i>0;i--)
			f = f* i;
		System.out.println(f);
	}
	
	static void printMaxTwoNumber()
	{
		int [] n  = {9,3,6,8,5,2,7};
		int first = 0;
		int second = 0;
		for(int i : n)
		{
			if(first<i)
			{
				second = first;
				first = i;
			}else if(second<i)
			{
				second = i;
			}
		}
		System.out.println(first);
		System.out.println(second);
	}
	static void runLenghtEncodedString()
	{
		String s = "wwwwaaadexxxxxxf";
		StringBuffer sb = new StringBuffer();
		
	    char temp =s.charAt(0);
	    int count=0;
		for(int i = 0;i<s.length();i++)
		{
			if(i==0)
				continue;

			if(s.charAt(i)==s.charAt(i-1))
			{
				count++;
			}
			else
			{
				sb.append(temp);
				sb.append(++count);
				temp = s.charAt(i);
				count = 0;
			}
		}
		sb.append(temp);
		sb.append(++count);
		System.out.println(sb.toString());
	}
	

	static int factorialR(int n)
	{
		if(n==1)
			return 1;
		return n*factorialR(n-1);
	}
	static void findingDuplicate()
	{
		int a [] = {1,2,3,4,5,6,6,7,8};
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
				continue;
			if(a[i]==a[i-1])
			{
				System.out.println(a[i]);
			}
		}
	}
	
	static void findingTotalNumberDuplicate()
	{
		int a [] = {1,2,3,4,5,6,6,7,8,8,9,9};
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
				continue;
			if(a[i]==a[i-1])
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	static void removeDuplicates()
	{
		int a [] = {1,1,2,3,4,5,6,6,7,8,9};
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(i==0 || a[i]!=a[i-1])
			{
				a[count++]=a[i];
			}
		}
		
		if(count!=a.length)
		{
			for(int i=count;i<a.length;i++)
			{
				a[i]=0;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void maximumSumInArray()
	{
		//int a [] = {-1,2,-4,-4,-8,3,-8,-9,-10,-5,0};
		int a [] = {1,-2,-4,5,-3,6};
		int sum = 0;
		int maxSum = a[0];
		
		int savePoint = 0;
		int start = 0;
		int end = 0;
		for(int i =0;i<a.length;i++)
		{
			sum = sum+a[i];
			if(maxSum<sum)
			{
				start =savePoint;
				end = i;
				maxSum = sum;
				
			}else if(sum<0)
			{
				savePoint = i+1;
				sum =0;
			}
		}
		System.out.print("Max Sum::::"+maxSum);
		System.out.print(" , start index::::"+start);
		System.out.print(" , end index::::"+end);
		System.out.print(" , SubArray:[");
		for(int i=start;i<=end;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println("]");
	}
	
	public static void main1(String[] args) {
		  Scanner in = new Scanner(System.in);
		  int count;
		  count = Integer.parseInt(in.nextLine());
		  
		  for(int i=0;i<count;i++)
		  {
		   int countOfElement = Integer.parseInt(in.nextLine());
		   String listOfElements = in.nextLine();
		   int[] a = getIntegerArray(countOfElement, listOfElements);
		   maximumSumInArray(a);
		  // System.out.print(maxContiguouSubarray(countOfElement, a));
		  // System.out.println(" " + maxNonContiguouSubarray(countOfElement, a));
		  }
		 }
	
	private static int[] getIntegerArray(int count, String integerList) {
		  int[] intArray = new int[count];
		  int i=0;
		  StringTokenizer st = new StringTokenizer(integerList, " ");
		  
		  while (st.hasMoreElements()) {
		   String nextElement = (String) st.nextElement();
		   intArray[i]=Integer.parseInt(nextElement);
		   i++;
		  }
		  return intArray;
		 }
	
	static void maximumSumInArray(int [] a)
	{
		//int a [] = {-1,2,4,-4,8,3,-8,-9,10,5};
		int sum = 0;
		int maxSum = 0;
		
		int savePoint = 0;
		int start = 0;
		int end = 0;
		for(int i =0;i<a.length;i++)
		{
			sum = sum+a[i];
			if(maxSum<sum)
			{
				start =savePoint;
				end = i;
				maxSum = sum;
			}else if(sum<0)
			{
				savePoint = i+1;
				sum =0;
			}
		}
		System.out.print("Max Sum::::"+maxSum);
		System.out.print(" , start index::::"+start);
		System.out.print(" , end index::::"+end);
		System.out.print(" , SubArray:[");
		for(int i=start;i<=end;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println("]");
		//return a;
	}
	
	static void maximumSumInArray(int k)
	{
		int [] a = {1,2,3,1,-4,3,0,2,8,1,9};
		int sum = 0;
		int start= 0;
		int end = 0;
		
		int savePoint = 0;
		
		for(int i =0;i<a.length;i++)
		{
			sum = sum +a[i];
			if(sum==k)
			{
				start = savePoint;
				end = i;
				sum =0;
				savePoint++;
			}else if(sum < k)
			{
				end = i;
			}else
			{
				
			}
		}
		
		for(int i=start;i<=end;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println("]");
	}

	static String reverseString(String actual)
	{
		String reverse = "";
		if(actual.length()>0)
		{
			reverse = actual.charAt(actual.length()-1)+reverseString(actual.substring(0, actual.length()-1));
		}
		return reverse;
		
	}
	/**
	 * best case(already sorted) - O(n)
	 * worst and average case - O{n2) 
	 */
	static void bubbleSort()
	{
		int counter= 0;
		int [] a = {9,4,2,10,5,1};
		//int [] a = {1,2,3,4,5};
		//int [] a = {5,4,3,2,1};
		boolean swapped = false;
		for(int i =0;i<a.length;i++)
		{
			counter++;
			if(!swapped && i!=0)
				break;
			swapped = false;
			for(int j=0;j<(a.length-i-1);j++)
			{
				counter++;
				if(a[j]>a[j+1])
				{
					a[j] = a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j] = a[j]-a[j+1];
					swapped = true;
				}
			}
		}
		System.out.println("bubble sort :::::: ");
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println("counter : "+counter);
	}
	
	/**
	 * 
	 * best,worst and average case - O{n2) 
	 * less swaps and more comparisions than insertion sort
	 */
	static void selectionSort()
	{
		int counter= 0;
		int [] a = {9,4,2,10,5,1};
		//int [] a = {1,2,3,4,5};
		//int [] a = {5,4,3,2,1};
		int min =0;
		for(int i =0;i<a.length;i++)
		{
			counter++;
			min = i;
			for(int j=i+1;j<a.length;j++)
			{
				counter++;
				if(a[min]>a[j])
				{
					min = j; 	
				}
			}
			if(min!=i)
			{
				a[min] = a[min]+a[i];
				a[i]=a[min]-a[i];
				a[min] = a[min]-a[i];
			}
		}
		
		System.out.println("selection sort :::::: ");
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println("counter : "+counter);
	}
	
	
	/**
	 * number of comparisions are less but swaps will be more.
	 * Best - O(n)
	 * Average - O(n^2)
	 * Worst case- O(n^2)
	 */
	static void insertionSort()
	{
		int counter= 0;
		int [] a = {1,4,3,5,6,2};
		//int [] a = {9,4,2,10,5,1};
		//int [] a = {1,2,3,4,5};
		//int [] a = {5,4,3,2,1};
		for(int i =0;i<a.length-1;i++)
		{
			counter++;
			int j = i;
			while(j>=0 && a[j]>a[j+1])
			{
				counter++;
				a[j] = a[j]+a[j+1];
				a[j+1]=a[j]-a[j+1];
				a[j] = a[j]-a[j+1];
				j--;
			}
		//	System.out.println(a.length);
			for(int k =0;k<a.length;k++)
			{
				
				System.out.print(a[k]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("insertion sort :::::: ");
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println("counter : "+counter);
	}
	
	//Quick sort 
	//- for smaller sets it is faster.
	//- worst case O(n2)
	//-best and average case O(nlogn)
	static void quickSort()
	{
		//int [] a = {1,4,3,6,5,2};
		//int [] a = {1,2,3,4,5};
		int [] a = {5,-4,3,2,1,9,0,-8,7,6,99,76,102,19,18};
		
		quickSortPartition(a,0,a.length-1);
		System.out.println("quick sort :::::: ");
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		//System.out.println("counter : "+quickSortCounter);
	}
	/**
	 * 
	 * @param a
	 * @param min
	 * @param max
	 */
	static void quickSortPartition(int [] a,int min,int max)
	{
		System.out.println();
		System.out.println("min : "+min+" , max : "+max);
		int pivot = a[(min+max)/2];
		int left=min;
		int right = max;
		while(left<right){
			quickSortCounter++;
			while(a[left]<pivot)
			{
				quickSortCounter++;
				left++;
			}
			
			while(a[right] > pivot)
			{
				quickSortCounter++;
				right--;
			}
			
			//if(left<right)
			if(a[left]>a[right])
			{
				a[left] = a[left]+a[right];
				a[right]=a[left]-a[right];
				a[left] = a[left]-a[right];
			}
			left++;
			right--;
			System.out.println();
			for(int i =0;i<a.length;i++)
			{
				System.out.print(a[i]+ " ");
			}
		}
		if(min<right)
			quickSortPartition(a,min,right);
		if(left<max)
			quickSortPartition(a,left,max);
	}
	
	
	//merget sort 
	//- for larger sets it is faster.
	//- occupies extra memory
	// - does not reorder sorted elements
	static void mergeSort()
	{
		int [] a = {9,4,2,10,5,1};
		//int [] a = {1,2,3,4,5};
		//int [] a = {5,4,3,2,1};
	    
	}
	
	
	
	static void binarySearch()
	{
		int [] a = {1,2,3,4,5,6,8,9,10};
		int search =7;
		System.out.println(binarySearch(a, 0, a.length, search));
	}
	
	static int binarySearch(int [] a,int i,int j,int search)
	{
		int low =i;
		int high = j;
		
		int mid = (low+high)/2;
		if(a[mid]>search)
		{
			return binarySearch(a,low,mid-1,search);
		}
		else if(a[mid]<search)
		{
			return binarySearch(a, mid+1, high, search);
		}
		else
		{
			return a[mid];
		}
	}
	
	private static void merge()
	{
		int arrayOne[] = {1};
		int arrayTwo[] = {4,3,5};
		arrayOne = arrayTwo;
		int arrayOneLength = arrayOne.length;
		int arrayTwoLength = arrayTwo.length;
		int mergedArray[] = new int[arrayOneLength+arrayTwoLength];
		int mergetArrayLength = mergedArray.length;
		
		int count=0;
		for(int i = 0 ;i<arrayOneLength;i++)
		{
			mergedArray[count++] = arrayOne[i];
		}
		
		for(int i = 0 ;i<arrayTwoLength;i++)
		{
			
			mergedArray[count++] = arrayTwo[i];
		}
		
		for(int i = 0 ;i<mergetArrayLength;i++)
		{
			System.out.println(mergedArray[i]);
		}
	}
}
