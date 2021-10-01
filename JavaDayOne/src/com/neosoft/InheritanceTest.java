package com.neosoft;

public class InheritanceTest {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		int[] intArray2 = {10,20,30,40,50};
		
		// TODO Auto-generated method stub
		Child child = new Child();
		child.showParent();
		child.showChild();
		
		Parent object = new Parent();
		object.parent_member1 = 100;
		
		//Child c = new Parent(); is invalid. it is reverse 
		Child2 child2 = new Child2();
		child2.parent_member1 = 20;
		child2.child_member1 = 90;
		
		//Testing Super
		B b = new B();
		b.show();
	}

}


class Parent{
	int parent_member1;
	void showParent() {
		System.out.println("This isParent Method");
	}
}

class Child extends Parent{
	int child_member1;
	//Super is used to reffes to immediate parent class of client class
	void showChild() {
		System.out.println("This is Child Method");
	}
}

class Child2 extends Child{ //Multilevel Inheritance : is a relationship
	int child2_member;
}

//Using SUper keyword
class A{ //This is parent for B
	String  name;
	void show() {
		name = "A";
		
		System.out.println(name);
	}
}
class B extends A{
	String name;
	
	void show() {
		super.show();//Calling Parent Method : A
		name = "B";
		
		System.out.println(name + " Parent "+super.name);
	}//Super is to refer immediate Parent : it is called "IS A RELATION"
}