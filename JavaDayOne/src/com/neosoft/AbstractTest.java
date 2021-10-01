package com.neosoft;

public class AbstractTest {  //Data Abstraction

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		college1 child = new college1();
		child.infoTech();
		child.sports();
		
		college2 child1 = new college2();
		child1.infoTech();
		child1.sports();
	}

}
abstract class University{
	void infoTech() {
		System.out.println("Show");
	}
	abstract void sports(); //Has no body
}
class college1 extends University{

	@Override
	void sports() {
		// TODO Auto-generated method stub
			System.out.println("Done chess!");
	}
	
}
class college2 extends University{

	@Override
	void sports() {
		// TODO Auto-generated method stub
			System.out.println("chess,Tennis");
	}
	
}