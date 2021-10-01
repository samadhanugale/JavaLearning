package com.neosoft;
//Scanner is use to get input from user

import java.lang.*; //Default package
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
//		System.out.print("enter your Name, Age and Salary :  ");
//		String name = input.nextLine();
//		int age = input.nextInt();
//		double salary = input.nextDouble();
//		System.out.println("Hi "+name);
//		System.out.println("Your age :  "+(2021-age));
//		System.out.println("Your Salary : "+salary);
		
		System.out.println("Enter your age :");
		String txtAge = input.nextLine();
		int age = Integer.parseInt(txtAge);
				
		System.out.print("You born in : "+ (2021 - age));
		input.close();
	}

}
