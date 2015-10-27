package com.satish.algorithms;


/**
 * Print Number in Words
 * @author satishkamavaram
 *
 */
public class Algorithm8 {

	 
	public static void main(String[] args) {
		printNumersInWords();
		
		
	}
	
	private static void printNumersInWords()
	{
		int i = 999;
	
		
		String [] numbers = {"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN",
				"EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN",
				"FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN","TWENTY"};
		
		String [] tens = {"","TEN","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINTY","HUNDRED"};
				
		int r ;
		while(i>0)
		{
			if(i<=20)
			{
				System.out.print(numbers[i]+" ");
				i=0;
			}
			else if(i>=100)
			{
				r  = i/100;
				System.out.print(numbers[r]+" "+tens[10]+" "); 
				i = i%100;
			}
			else{
				r = i%10;
				i = i - r;
				i = i/10;
				System.out.print(tens[i]+" "+numbers[r]); 
				i=0;
			}
		}
		
	}


}
