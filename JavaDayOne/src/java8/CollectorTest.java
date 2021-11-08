package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorTest {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(12,34,45,56,67,87));
		Set<Integer> setInt = intList.stream().filter(i->i>20).collect(Collectors.toSet());
		System.out.println(setInt);
		
		
		long counter = intList.stream().collect(Collectors.counting());
		System.out.println("Counter : "+counter);
		
		//int total = intList.stream().collect(Collectors.summarizingInt(i->i));
		intList.clear();
		setInt.clear();
	
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1,20));
		students.add(new Student(2,17));
		students.add(new Student(3,15));
		students.add(new Student(4,20));
		students.add(new Student(5,14));
		students.add(new Student(6,18));
	
		
		Double totalMarks = students.stream().collect(Collectors.averagingInt(st->st.marks));
		System.out.println(totalMarks);
		
		System.out.println(students.stream().collect(Collectors.groupingBy(st ->st.marks,Collectors.counting())));
		System.out.println(students.stream().collect(Collectors.summarizingInt(st ->st.marks))); //Giving all info like count sum min max avg
	}
}

class Student{
	int id;
	int marks;
	public Student(int id, int marks) {
		this.id = id;
		this.marks = marks;
	}
	
}
