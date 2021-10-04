package com.neosoft;

public class ThreadTest extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		System.out.println("Thread 1 is runnning!");
		this.setName("My ThreadTest-1");
		System.out.println("Thread Name : "+this.getName());
		System.out.println("Thread ID : "+this.getId());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ThreadTest myThread = new ThreadTest();
//		myThread.run();
//		
//		
//		ThreadTest2 myThread2 = new ThreadTest2();
//		Thread thread = new Thread(myThread2);
//		thread.run();
//		
//		ThreadTest3 myThread3 = new ThreadTest3();
//		myThread3.run();
		
//		ThreadTest myThread1 = new ThreadTest();
//		ThreadTest3 myThread2 = new ThreadTest3();
//		ThreadTest3 myThread3 = new ThreadTest3();
//		
//		try {
//			myThread1.run();
//			myThread1.join();
//			myThread2.run();
//			myThread1.join();
//			myThread3.run();
//		}
//		catch(InterruptedException e) {
//			System.out.println(e);
//		}
		
		ThreadTest3 myThread1 = new ThreadTest3();
		myThread1.start();
		try {
			myThread1.interrupt();
		}
		catch(Exception e) {
			System.out.println("Interrupting : ");
		}
	}
	

}
class ThreadTest2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 2 is runnning! "+Thread.currentThread().getName());
	}
	
}

class ThreadTest3 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
				System.out.println("Thread ID is : "+this.getId());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
			}
			System.out.println(i);
			
		}
	}
	
}