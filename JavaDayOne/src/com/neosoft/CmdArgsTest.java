package com.neosoft;

public class CmdArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Sum : "+(a+b));
		
		for(int i = 0;i<args.length;i++)
			System.out.println(args[i]);
	}

}
