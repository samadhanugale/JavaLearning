package com.neosoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparibleTest {
	public static void main(String[] args) {
		ArrayList<Candidate> students = new ArrayList<Candidate>();
		students.add(new Candidate(102, "Sagar", "JAVA", 10));
		students.add(new Candidate(103, "Vishal", "OOP", 11));
		students.add(new Candidate(104, "Pratik", "PYTHON", 12));
		students.add(new Candidate(105, "Shubham", "JAVA", 10));
		
		/*
		 * //Collections.sort(students);
		 * Collections.sort(students,Collections.reverseOrder()); //sorting in In
		 * reverse order
		 * 
		 * for (Candidate candidate: students) { System.out.println(candidate); }
		 */
		Candidate stud1 = Collections.min(students);
		Candidate stud2 = Collections.max(students);
		System.out.println("Min Marks : "+stud1);
		System.out.println("Max Marks : "+stud2);
		students.clear();
	}
}

class Candidate implements Comparable<Candidate> {
	int stid;
	String name;
	String course;
	int marks;

	public Candidate(int stid, String name, String course, int marks) {
		super();
		this.stid = stid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StdId : " + stid + " Name :" + name + " course : " + course + " Marks : " + marks;
	}

	@Override
	public int compareTo(Candidate o) {
		// TODO Auto-generated method stub
		/*
		 * if(this.marks == o.marks) { return 0; } else if(this.marks > o.marks) {
		 * return 1; } else { return -1; }
		 */
		return this.marks-o.marks; //Comparing Marks
	}

}