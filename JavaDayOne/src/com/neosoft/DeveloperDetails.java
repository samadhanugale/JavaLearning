package com.neosoft;

import java.util.Scanner;

public class DeveloperDetails extends EmployeeDetails {
	public String skill;
	public String project_name;
	
	public DeveloperDetails(int eid, String ename, int deptno, double salary, String skill, String project_name) {
		super(eid, ename, deptno, salary);
		this.skill = skill;
		this.project_name = project_name;
	}

	public void showProfile() {
		System.out.println("Skill :"+skill+" Project Name :"+project_name);
	}
	
	
}
