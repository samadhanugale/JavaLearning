package com.neosoft;

public class interfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle.move();
		System.out.println("Is movable? : "+vehicle.isMovable());
		System.out.println("Is Rollable? : "+vehicle.isRollable());
	}

}
interface Movable{
	int average_speed = 50; //Automatically it will public, final, static
	void move();//Automatically it will public and abstract because it is in interface
	boolean isMovable();
}

interface Rollable{
	boolean isRollable();
}

class Vehicle implements Movable,Rollable{

	@Override
	public boolean isRollable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Average speed : "+average_speed);
	}

	@Override
	public boolean isMovable() {
		// TODO Auto-generated method stub
		return true;
	}
	
}