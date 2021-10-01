package com.neosoft.accesstest;

import com.neosoft.AccessSpecifiers;

public class AccessTest extends AccessSpecifiers {
	public static void main(String[] args ) {
		AccessSpecifiers object = new AccessSpecifiers();
		object.public_member = 200;
		object.publicShow();
		
		AccessTest obj = new AccessTest();
		obj.protected_number = 3000;
		obj.public_member = 300;
		obj.protectedShow();
	}

}
