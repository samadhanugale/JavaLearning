package com.neosoft;

public class StudentsData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsMain student1 = new StudentsMain();
		student1.name = "Rushikesh";
		student1.city = "Nashik";
		student1.specialization = "Drugist";
		student1.age = 25;
		student1.qualification = "D Pham";
		student1.email = "rushikesh@email.com";
		student1.showDetails();
		System.out.println("State : "+StudentsMain.state);
		
		System.out.println("------------------------------------------");
		
		StudentsMain student2 = new StudentsMain();
		student2.name = "Rutik";
		student2.city = "Ozar";

		student2.showDetails();
		System.out.println("Company : "+StudentsMain.state);
		
		System.out.println("------------------------------------------");
		
		StudentsMain student3 = new StudentsMain("Sagar","BSC","Computer",23,"DELHI","Sagar@gmail.com");
		student3.showDetails();
		System.out.println("Company : "+student3.state);
		
		System.out.println("------------------------------------------");
		
		StudentsMain student4 = new StudentsMain("Ajay", "B Tech", "Mechanical", 23, "Nashik","Ajay@ajay");
		student4.showDetails();
		System.out.println("Company : "+student4.state);

	}

}
