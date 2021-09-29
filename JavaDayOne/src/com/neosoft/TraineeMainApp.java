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
	System.out.println("Company : "+TraineeSoftEng.company_name);
	
	System.out.println("------------------------------------------");
	
	TraineeSoftEng candidate3 = new TraineeSoftEng("Sagar","BSC",23,"DELHI","Sagar@gmail.com");
	candidate3.showDetails();
	System.out.println("Company : "+candidate3.company_name);
	
	TraineeSoftEng candidate4 = new TraineeSoftEng("Ajay","BTECH",23,"NASHIK","ajay@gmail.com");
	candidate4.showDetails();
	System.out.println("Company : "+candidate4.company_name);
	
	}
}
