/*
 * package com.neosoft;
 * 
 * public class EnumStudentMain { int stdId; String stdName; String Subject; int
 * Marks;
 * 
 * EnumStudentMain subject; public EnumStudentMain(EnumStudentMain subject;) {
 * // TODO Auto-generated constructor stub this.subject = subject; }
 * 
 * public EnumStudentMain(int stdId, String stdName, String subject, int marks)
 * { super(); this.stdId = stdId; this.stdName = stdName; Subject = subject;
 * Marks = marks; }
 * 
 * void subCheck() { switch(Subject) { case JAVA: System.out.println("JAVA");
 * 
 * break; case C: System.out.println("Today is TUESDAY!"); break; case PYTHON:
 * System.out.println("Today is WEDNESDAY!"); break; case CPP:
 * System.out.println("Today is THURSDAY!"); break; } }
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * System.out.print("Enter Subject : "); String subject = new
 * java.util.Scanner(System.in).nextLine().toUpperCase();
 * 
 * try { EnumStudentMain objct = new
 * EnumStudentMain(EnumSubjects.valueOf(subject)); objct.subCheck(); }
 * catch(IllegalArgumentException e) { System.out.println("Exception : "+e); }
 * EnumStudent student1 = new EnumStudent(1,"NameOne","JAVA", 20); EnumStudent
 * student2 = new EnumStudent(2,"NameTwo","JAVA", 10); EnumStudent student3 =
 * new EnumStudent(3,"NameThree","CPP", 25); EnumStudent student4 = new
 * EnumStudent(4,"NameFour","C", 30); EnumStudent student5 = new
 * EnumStudent(5,"NameFive","PYTHON", 40);
 * 
 * student1.showStudent(); }
 * 
 * }
 */