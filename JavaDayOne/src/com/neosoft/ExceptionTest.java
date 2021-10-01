package com.neosoft;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest {

	public static void main(String[] args) {//throws FileNotFoundException {
		// TODO Auto-generated method stub
//		String str = null;
//		System.out.println(str.length()); //Exception occured : Null pointer exception
		
		try {
			int a = 10;
			int b = 0;
			if(b==0)
				throw new ArithmeticException(" B should not be 0"); //Explicitly throwing exception with custom message
			int result = a/b;
			
			System.out.println(result); //Divide by zero exception occured while runtime
			
		}
		catch (ArithmeticException e) { //Specific Exception
			System.out.println("Can't divide by zero"+e.getMessage());
			e.printStackTrace(); //To print error message
		}
		catch(Exception e) { //Parent exception
			System.out.println("Something went Wrong! : "+e.getMessage());
		}
		finally { //Closing resourses/ default class which executes always and closes connection and free off thememory
			System.err.println("I'm Always there!"); // To print message in red font color
		}
		
		File file = new File("/file.txt");
		try {
			FileReader fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File not found!");
		
//		int[] myarray = {10,20,30};
//		System.out.println(myarray[3]); // Index out of bound exception
		
		System.out.println("End of program");
	}

}
