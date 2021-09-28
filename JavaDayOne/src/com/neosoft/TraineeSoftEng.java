package com.neosoft;

public class TraineeSoftEng { //User defined classs
								//Set of attributes
	
	String name; 				//By default it is null
	String qualification;
	int age; 					//By default it is 0
	String city;
	String email;
	
	
	//Special methood having same name as class name and no return type
	
	public TraineeSoftEng() {
	name = "Unknown";	
	qualification = "Unknown";
	city = "Missing";
	email = "NA";
	
	}
	
	public final static String company_name = "NEOSOFT"; //final : Cannot be modified further
	
	public void showDetails() { //our own method (instance Behaviour)
		System.out.println("Name of person : "+name+", Qualification : "+qualification+","
				+ " Age : "+age+", City : "+city+", Email : "+email);
	}
}
