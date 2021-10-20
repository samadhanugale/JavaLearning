package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpTest2RunningThreadSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Runnable runable = () ->{ for (int i = 0; i <= 10; i++) { try {
		 * System.out.print(i+" "); Thread.sleep(500); } catch(InterruptedException e) {
		 * e.printStackTrace(); } } }; Runnable runable2 = () ->{ for (int j = 0; j <=
		 * 10; j++) { try { System.out.println(j+" "); Thread.sleep(500); }
		 * catch(InterruptedException e) { e.printStackTrace(); } } }; new
		 * Thread(runable).start(); new Thread(runable2).start();
		 */

		/*
		 * List<Integer> list = new ArrayList<Integer>(); list.add(101); list.add(102);
		 * list.add(103); list.add(104); list.add(105);
		 * 
		 * //list.forEach((number) -> System.out.println(number)); //Traversing and
		 * printing list list.forEach((number) -> { if(number>103)
		 * System.out.println(number+" "); });
		 */
	
	List<Mobile> mobiles = new ArrayList<Mobile>();
	mobiles.add(new Mobile(11, 1000, "iphone"));
	mobiles.add(new Mobile(12, 1200, "samsung"));
	mobiles.add(new Mobile(13, 1400, "xiaomi"));
	mobiles.add(new Mobile(14, 1600, "oneplus"));
	
	Collections.sort(mobiles,(m1,m2)->m1.name.compareTo(m2.name));
	mobiles.forEach((mobile)->System.out.println(mobile.name));
	}

}

class Mobile {
	int id;
	double price;
	String name;
	public Mobile(int id, double price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	
}
