package com.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class A {

	
	public static void main(String[] args) {
		String s = "satish+/";
		System.out.println(s.hashCode());
		int h = 0;
		char val[] = s.toCharArray();
System.out.println(s.getBytes().length);
        for (int i = 0; i < val.length; i++) {
        
            h = 31 * h + val[i];
            System.out.println((int)val[i]);
        }
        System.out.println(h);
		//(i ^ i>>>16)
		System.out.println(11 & -101989879);
		System.out.println(10&11);
		System.out.println(10|11);
		System.out.println(10^11);
		System.out.println(~10);
		
	}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		//int i = 0;
		
		
		
	
	//int i  = 1;
	/*while(list.size()!=1)
	{
		System.out.println("..."+i);
		try{
		list.remove(i);
		i=i+2;
		}catch(Exception e)
		{
			
			i = 0;
		}
		System.out.println(list);
	}*/
		List<Integer> list = range(1,100);
	Iterator<Integer> iterator = list.iterator();
	boolean even = true;
	boolean isRemoved = false;
	while(list.size()!=1)
	{
		System.out.println(list);
		/*if(list.size()%2 == 0)
			even = true;
		else
		   even = false;*/
		
		iterator = list.iterator();
		int i = 0;
		while(iterator.hasNext())
		{
			if(i == 0){
				iterator.next();
				i++;
			if(even){
			
				if(i%2==0)
				  iterator.remove();
			}else
			{
				iterator.remove();
			}
			}
			else
			{
				iterator.next();
				i++;
				if(even){
					//System.out.println("...event");
				if(i%2==0){
					  iterator.remove();
					  isRemoved = true;
				}
				else
					isRemoved = false;
				}
				else
				{
					if(i%2!=0){
						  iterator.remove();
						  isRemoved = true;
					}
					else
						isRemoved = false;
				}
				
			}
		}
		
		if(!isRemoved)
			even = false;
		else
			even = true;
	}
		System.out.println(list);
	}

	public static List<Integer> range(int min, int max) {
        List<Integer> list = new LinkedList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }

        return list;
    }
}

