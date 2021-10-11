package com.neosoft;

public class ThreadMethodTest extends Thread {
	@Override
	public void run() {
		System.out.println(this.currentThread().isDaemon());
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ThreadMethodTest thread1 = new ThreadMethodTest();
//		ThreadMethodTest thread2 = new ThreadMethodTest();
//		thread1.run();
//		thread2.run();
//		
//		for(int i=0;i<3;i++) { 
//			thread1.yield(); //Pauses execution of current threads temporarily to run other threads
//			System.out.println(Thread.currentThread().getName() + " Is is control");
//		}
		
		ThreadMethodTest2 thread1 = new ThreadMethodTest2();
		ThreadMethodTest2 thread2 = new ThreadMethodTest2();
		ThreadMethodTest2 thread3 = new ThreadMethodTest2();
		
		thread1.run();
		thread1.setDaemon(true);
		System.out.println(thread1.isDaemon());
		System.out.println(thread1.currentThread().getName());
		thread2.run();
		System.out.println(thread2.isDaemon());
		thread2.suspend();
		thread3.run();
		thread2.resume();
	}

}




class ThreadMethodTest2 extends Thread{
	@Override
	public void run() {
		try {
			sleep(500);
			System.out.println(Thread.currentThread().getName());
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}