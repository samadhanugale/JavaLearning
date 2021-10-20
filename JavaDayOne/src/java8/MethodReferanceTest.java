package java8;



interface Showable{
	void show();
}

interface Showable2{
	void show2(String msg);
}

public class MethodReferanceTest {
	public MethodReferanceTest() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor");
	}
	
	public MethodReferanceTest(String msg) {
		// TODO Auto-generated constructor stub
		System.out.println(msg);
	}
	
	
	public static void showTest(){ //Static method
		System.out.println("This is some message");
	}
	
	//instance method	 	
	public void showText2() {
		System.out.println("This is instance method");
	}
	
	public static void main(String[] args) {
		//Refer static method
		Showable s = MethodReferanceTest::showTest;
		s.show();
		
		new Thread(MethodReferanceTest::showTest).start();
		
		System.out.println("---------");
		MethodReferanceTest obj = new MethodReferanceTest();
		Showable s2 = obj::showText2;
		s2.show();
		new Thread(obj::showText2).start();
		
		System.out.println("---------");
		
		Showable s3 = MethodReferanceTest::new; //Constructor referance
		s3.show();
		
		Showable2 s4 = MethodReferanceTest::new; 
		s4.show2("Welcome there");
		
		
		
	}
}
