package com.neosoft;

import java.lang.reflect.Array;
import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(102, "Sagar", "JAVA", 10));
		students.add(new Student(103, "Vishal", "OOP", 11));
		students.add(new Student(104, "Pratik", "PYTHON", 12));
		students.add(new Student(105, "Shubham", "JAVA", 13));

		Iterator<Student> itr = students.iterator();
		
		//
		
		
		//
		while (itr.hasNext()) {
			Student student = itr.next();
			System.out.println(student);
			
			
		
		}
		students.remove(3);
		students.add(2, new Student(111, "Sarthak", "English", 9));
		students.add(new Student(222, "Sidd", "German", 14));

		System.out.println("+--------------------------+");
		
		List<Integer> list = new ArrayList<Integer>();


		
		for (Student student : students) {
			System.out.println(student);
			
	
		}
		students.clear();
		
		
		//LinkedListStuff
		//Head --> prev | Next --> prev | Next -->Null
		System.out.println("+--------------------------+");
		ArrayList colplexList = new ArrayList(Arrays.asList(null, 10, 10.4, "JAVA", true));
		System.out.println("--------------LinkedList-----------------------------");
		LinkedList<Object> ComplexLinkedList = new LinkedList(Arrays.asList(null, 10, 10.4, "JAVA", true));
		ComplexLinkedList.add(1,100);
		ComplexLinkedList.removeFirst();
		System.out.println(ComplexLinkedList);
		ComplexLinkedList.addFirst(230);
		System.out.println(ComplexLinkedList);
		ComplexLinkedList.removeLast();
		System.out.println(ComplexLinkedList);
		System.out.println("-----------------------------------------------------");
		ComplexLinkedList.clear();
		
		for (Object obj : colplexList) {
			System.out.println(obj);
		}
		
		//
		int sum=0;
		for(Object ob:colplexList) {
			if(ob instanceof Integer)
				sum+=Integer.parseInt(ob.toString());
		
		}
		System.out.println("Sum: "+sum);
		
		//
	}

}

class Student {
	int stid;
	String name;
	String course;
	int marks;

	public Student(int stid, String name, String course, int marks) {
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

}