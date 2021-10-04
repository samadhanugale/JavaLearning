package com.neosoft;

import java.util.GregorianCalendar;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Banana";
//		str = str.concat(" With apple");
//		System.out.println(str);
//		
//		String s1 = "HELLO"; //S1 and s2 have same address in the string constant pool(Memory Area)
//		String s2 = "HE";
//		String s3 = new String("HELLO");
//		System.out.println(s1 == s2); //True -> Just comparing values and *address*
//		System.out.println(s1 == s3); //False -> //Comparing with referances
//		System.out.println(s1.equals(s2)); //True //Comparing only contents
//		System.out.println(s1.equals(s3)); //True 
//		//if want to check only contents go with equals() Method
//		//if want to ckeckboth address and contents go for ==
//		
		System.out.println("------------------------------------------");
		
		//Performance or speed test
		
		System.gc();
		long start = new GregorianCalendar().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();
		System.out.println(startMemory);
		System.out.println(start);
		
//		String str1 = new String();
		String str1 = new String();
		
		//string builder will be efficient
		for(int i = 0;i<100000;i++)
			str1 = str1.concat("i:");
		
		long end = new GregorianCalendar().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();
		
		System.out.println("Time Taken : "+(end-start));
		System.out.println("Time Taken : "+(startMemory-endMemory ));
	}

}
