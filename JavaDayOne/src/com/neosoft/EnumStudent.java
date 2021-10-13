package com.neosoft;

public class EnumStudent {
	int stdId;
	String stdName;
	String Subject;
	int Marks;
	public EnumStudent(int stdId, String stdName, String subject, int marks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.Subject = subject;
		this.Marks = marks;
	}
	public void showStudent(){
		System.out.println("Student ID : "+stdId);
		System.out.println("Student Name : "+stdName);
		System.out.println("Student Subject : "+Subject);
		System.out.println("Marks : "+Marks);
		
	}
	
}
