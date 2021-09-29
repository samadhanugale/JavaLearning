package com.neosoft;

public class StudentsMain {
	String name; 				//By default it is null
	String qualification;
	String specialization;
	int age; 					//By default it is 0
	String city;
	String email;
	
	
	//Special methood having same name as class name and no return type
	
	public StudentsMain() {
	name = "NA";	
	qualification = "NA";
	city = "NA";
	email = "NA";
	
	}
	//Parameterized Constructor
	public StudentsMain(String name, String qualification,String specialization, int age, String city, String email) {
		super();
		this.name = name; //"This" used  to refer current instance
		this.qualification = qualification;
		this.specialization = specialization;
		this.age = age;
		this.city = city;
		this.email = email;
	}

	public final static String state = "MAHARASHTRA"; //final : Cannot be modified further
	
	public void showDetails() { //our own method (instance Behaviour)
		System.out.println("Name of Student : "+name+",\n"
				+ " Qualification : "+qualification
				+",\n"
				+"Specialization :"+specialization
				+",\n"
				+ " Age : "+age+",\n"
				+ " City : "+city+",\n"
				+ " Email : "+email);
	}
}
