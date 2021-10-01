package com.neosoft;

import java.util.Scanner;

public class InternDetails extends DeveloperDetails{

	public String probabation;
	
	public String certificate;
	
	
	
	
	public InternDetails(int eid, String ename, int deptno, double salary, String skill, String project_name,
			String probabation, String certificate) {
		super(eid, ename, deptno, salary, skill, project_name);
		this.probabation = probabation;
		this.certificate = certificate;
	}




	public void showStatus() {
		System.out.println("Probabation :"+probabation+" Certificate:"+certificate);
	}
}
