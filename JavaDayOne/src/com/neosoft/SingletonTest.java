package com.neosoft;

public class SingletonTest {
	public static void main(String[] args) {
		//instantiating singleton class
		Singleton obj1 = Singleton.getInstance();
		
		//instantiating singleton class
		Singleton obj2 = Singleton.getInstance();
		
		//instantiating singleton class
		Singleton obj3 = Singleton.getInstance();
		
		System.out.println("Hashcode of obj1 : "+obj1.hashCode());
		System.out.println("Hashcode of obj2 : "+obj2.hashCode());
		System.out.println("Hashcode of obj3 : "+obj3.hashCode());
		
		System.out.println("Database Name : "+obj1.database_name);
	}
}

class Singleton {
	private static Singleton single_obj = null;
//member
	public String database_name;

//private constructor
	private Singleton() {
		database_name = "My Database";
	}
///Static method for single instance creation
	public static Singleton getInstance() {
		if(single_obj == null) {
			single_obj = new Singleton();
			
		}
		return single_obj;
	}
}