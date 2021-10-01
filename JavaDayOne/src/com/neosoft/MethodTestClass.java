package com.neosoft;

public class MethodTestClass {
	//ACCESS-specifier(optional) return_type parametername(parameterlist)
	String getMessage(String name, int age) {
		return "Welcome "+name+"\n Your age : "+age ;
	}
	
	int[] total(int a,int b) { //Local Parameters
		int[] intArray = new int[2];
		intArray[0] = a+b;
		intArray[1] = a-b;
		
		return intArray;
	}
	
	public static void main(String[] args) {
		MethodTestClass object = new MethodTestClass();
		
		//Directly calling function insode sysout
		System.out.println(object.getMessage("Sagar",22));
		
		//calling by storing in another variable and then print
		String msg = object.getMessage("Shubham",20);
		System.out.println(msg);
		
		//using method return multiple values
		int[] result = object.total(12, 5); //Passing Arguments
		System.out.println("Result Addition : "+result[0]);
		System.out.println("Result Substractio : "+result[1]);
	}
}
