package com.neosoft;

public class UserDefineException { //User defined exception

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int b = 5;
			if(b==5)
				throw new MyException(" B Should not be 5");
		}
		catch(MyException m) {
			System.out.println(m);
			System.out.println(m.getMessage());
		}
	}

}

class MyException extends Exception{
	String msg;
	public MyException(String msg) {
		super(msg); //Calling parent constructor
		this.msg = msg;
	}
	@Override //if we dont write this, it will show Hash code
	public String toString() {
		return "My Exception : "+msg;
	}
	
}