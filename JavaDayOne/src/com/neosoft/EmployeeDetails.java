package com.neosoft;

import java.util.Scanner;

public class EmployeeDetails {
	public int eid;
	public String ename;
	public int deptno;
	public double salary;
	
	



	public EmployeeDetails(int eid, String ename, int deptno, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.deptno = deptno;
		this.salary = salary;
	}





	public void showId() {
		System.out.println("Id Of Employee:"+eid);
	}
}
