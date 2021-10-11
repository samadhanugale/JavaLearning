package com.neosoft;

public class GenericTest {
public static void main(String[] args) {
	TestGen1<Integer> object = new TestGen1<Integer>(100);
	System.out.println(object.getObject());
	
	TestGen1<String> object1 = new TestGen1<String>("John"); //Specifying types of inputs to class 
	System.out.println(object1.getObject());
	
	System.out.println("-----------------");
	TestGen2<String,Integer> StrInt = new TestGen2<String,Integer>("Peter",100);  
	TestGen2<Double,Integer> DoubleInt = new TestGen2<Double,Integer>(2.4,100);  
	
	System.out.println(StrInt);
	System.out.println(DoubleInt);
	
	System.out.println("-----------------");
	
	TestGen3.GenericMethod(8);
	TestGen3.GenericMethod("Hannah");
	TestGen3.GenericMethod(2.4);
	
}
}
class TestGen1<T>{
	T obj;
	public TestGen1(T obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	public T getObject() {
		return this.obj;
	}
}
class TestGen2<T,U>{
	T obj1;
	U obj2;
	public TestGen2(T obj1,U obj2) {
		// TODO Auto-generated constructor stub
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.obj1 + " "+ this.obj2;
	}
}
class TestGen3{
	static<T> void GenericMethod(T element) {
		System.out.println(element.getClass().getName() + " = "+element);
		
	}
}