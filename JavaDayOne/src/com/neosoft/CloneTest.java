package com.neosoft;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Iphone6 iphone1 = new Iphone6(12, 6.5, 1.2);
		Iphone6 iphone2 = (Iphone6) iphone1.clone();
		Iphone6 iphone3 = (Iphone6) iphone2.clone();
		Iphone6 iphone4 = (Iphone6) iphone2.clone();
		Iphone6 iphone5 = (Iphone6) iphone2.clone();
		Iphone6 iphone = (Iphone6) iphone2.clone();

		System.out.println(iphone4.height);
	}
}

class Iphone6 implements Cloneable {
	double weight;
	double height;
	double width;

	public Iphone6(double weight, double height, double width) {
		super();
		this.weight = weight;
		this.height = height;
		this.width = width;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
