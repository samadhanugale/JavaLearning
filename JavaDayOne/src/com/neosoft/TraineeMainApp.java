package com.neosoft;

public class TraineeMainApp {
	
	public static void main(String[] args) {
		
	TraineeSoftEng candidate1 = new TraineeSoftEng();
	candidate1.name = "Rushikesh";
	candidate1.city = "Nashik";
	candidate1.age = 25;
	candidate1.qualification = "D Pham";
	candidate1.email = "rushikesh@email.com";
	candidate1.showDetails();
	System.out.println("Company : "+TraineeSoftEng.company_name);
	
	System.out.println("------------------------------------------");
	
	TraineeSoftEng candidate2 = new TraineeSoftEng();
//	candidate2.name = "Rutik";
//	candidate2.city = "Ozar";
//	candidate2.age = 20;
	candidate2.qualification = "BE";
//	candidate2.email = "rutik@gmail.com";
	candidate2.showDetails();
	System.out.println("Company : "+candidate2.company_name);
	}
}
