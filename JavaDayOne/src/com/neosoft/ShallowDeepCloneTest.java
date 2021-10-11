package com.neosoft;

import java.util.Arrays;

public class ShallowDeepCloneTest {
	public static void main(String[] args) {
		int[] a= {10,20,110};
		Shallow s = new Shallow(a);
		s.showData();
		System.out.println(s.hashCode());
		a[1] = 200;
		System.out.println(s.hashCode());
		s.showData();
		System.out.println("A : "+a.hashCode());
		
		
		Deep as = new Deep(a);
		as.showData();
		a[2] = 4000;
		as.showData();
	}
}

class Shallow{
	private int[] data;

	public Shallow(int[] data) {
				this.data = data;
	}
	public void showData() {
		System.out.println(Arrays.toString(data));
		System.out.println("Data "+data);
	}
	
}
class Deep{
	private int[] data;

	public Deep(int[] data1) {
				data = new int[data1.length];
				
				for(int i=0;i<data.length;i++) {
					data[i] = data1[i];
				}
	}
	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}