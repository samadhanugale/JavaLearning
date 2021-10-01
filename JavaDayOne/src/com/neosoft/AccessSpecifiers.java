package com.neosoft;

import com.neosoft.accesstest.AccessTest;

public class AccessSpecifiers {
	/*Access Specifiers : Public, Private, protected,default
	 * Public : Accessible within project within multiple packages
	 * Private : Accessible within class
	 * Protected : 
	 * Default : we can't access it outside package*/
	
	//Default Member
	int default_number = 10;
	
	//Default member
	void defaultShow() {
		System.out.println("Default Member");
	}
	
	//public member 
	public int public_member = 20;
	
	//Public Method
	public void publicShow() {
		System.out.println("Public Method");
	}
	
	protected int protected_number = 30;
	
	//Protected Method
	protected void protectedShow() {
		System.out.println("Protected Method");
	}
	
	//private member
	private int privete_member = 40;
	
	//Private Method
	private void privateShow() {
		System.out.println("Private method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessTest object = new AccessTest();
		//you can access all 
		childTest obj = new childTest();
		obj.default_number = 230;
		obj.protected_number = 200;
		obj.public_member = 900;
		
	}

}

class childTest extends AccessSpecifiers{
	
}

class NonSubClass{
	public void show() {
		
		//Anonymous way of object creation
		/// obj = new object(); obj.prop = value;
		
		// AccessSpecifiers object  = new AccessSpecifiers();
		//object.default_number = 700;
		new AccessSpecifiers().default_number = 700;
		new AccessSpecifiers().defaultShow();
		
		
	}
}


