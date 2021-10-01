package com.neosoft;

public class EmployeeMain {

	public static void main(String[] args) {
		DeveloperDetails[] developers = {
				new DeveloperDetails(101, "Lila", 10, 10000, "Java", "ECommerce"),
				new DeveloperDetails(102, "Rohan", 9, 12000, "PhP", "Web Site"),
				new DeveloperDetails(103, "Sanjay", 11, 9000, "Android", "Mobile App"),
				};		
		
		for(DeveloperDetails developer : developers) {
			if(developer.salary < 10000) {
				developer.showId();
				developer.showProfile();
			}
		}	
		
		InternDetails intern1 = new InternDetails(104, "Abc", 10, 11000, "Java", "ECommerce","two","OCA");
		intern1.showId();
		intern1.showProfile();
		intern1.showStatus();
	}

}
