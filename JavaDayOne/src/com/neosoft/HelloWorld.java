package com.neosoft;

public class HelloWorld {
	int x = 100;
	int y = 200;
	public static void main(String[] args) {
		System.out.println("Success!");
		
		HelloWorld helloWorld = new HelloWorld(); //create a new object
		
		System.out.println("Success!" +helloWorld.x);
		System.out.println("Success!"+helloWorld.y);
//		helloWorld.show();
	}
}
