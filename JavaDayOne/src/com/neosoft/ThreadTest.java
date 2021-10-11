package com.neosoft;

public class ThreadTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		ThreadTest1 thread1 = new ThreadTest1(a,b);
		try {
			
			thread1.run();
			thread1.sleep(2000);
		}
		catch(Exception e) {
			
			System.out.println("Exception Caught! : "+e);
		}
		
		
		ThreadTest2 thread2 = new ThreadTest2(a,b);
		thread2.run();
		
	}

}
class ThreadTest1 extends Thread{
	int a;
	int b;
	public ThreadTest1(int a,int b) {
		this.a = a;
		this.b=b;
	}
	@Override
	public void run() {
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.println("Even : "+i);
			}
		}
	}
}
class ThreadTest2 extends Thread{
	int a,b;
	public ThreadTest2(int a,int b) {
		this.a = a;
		this.b=b;
	}
	@Override
	public void run() {
		
		for(int i=a;i<=b;i++) {
			if(i%2!=0) {
				System.out.println("Odd : "+i);
			}
		}
	}
}