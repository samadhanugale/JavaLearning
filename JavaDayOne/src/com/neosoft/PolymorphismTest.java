package com.neosoft;

public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate calci = new Calculate();
		calci.sum(10, 20);
		calci.sum(10, 20, 30.5f);
		System.out.println("----------------------------------");
		
		PolymorphismTest.main('T');
		
		System.out.println("----------------------------------");
		
		Dog dog = new Dog();
		dog.eat();
		
		Cat cat = new Cat();
		cat.eat();
		
		Animal animal = new Dog();
		animal.eat();
		
		System.out.println("----------------------------------"); 
		
		Sample sample = new Sample(10.20, 20.30);
		System.out.println("Sample object : "+sample);
	}
	public static void main(char args) {
		// TODO Auto-generated method stub
		System.out.println("Overloading Main method "+args);
	}

}
class Calculate{///Method overloading : method name is same, parameter names are same but parameter types are different : compile polymorphism
	void sum(int a, int b) {
		System.out.println("Sum is : "+(a+b));
	}
	void sum(float a, float b) {
		System.out.println("Sum is : "+(a+b));
	}
	void sum(float a, float b, float c) {
		System.out.println("Sum is : "+(a+b+c));
	}
}
class Animal{ ///Method overriding : Both name and parameter must be same : Runtime polymorphism
	public void eat() {
		System.out.println("Eats all Eatables");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("Eats Meat..");
	}
}
class Cat extends Animal{
	public void eat() {
		System.out.println("Eats Milk..");
	}
}

///Overriding toString Method
//String representation of object
class Sample{
	double a,b;

	public Sample(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//String implementation of an object
		
		return "A : "+a+", B : "+b;
	}
}



