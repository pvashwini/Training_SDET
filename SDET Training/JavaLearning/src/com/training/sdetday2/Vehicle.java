package com.training.sdetday2;

public class Vehicle {
	private int speed;
	
	public Vehicle(int speed){
		//other jobs can be written here
		this.speed = speed;
	}
	protected int getSpeed() {
		return speed;
	}
	public void move()
	{
		System.out.println("Vehicle is Moving....@"+speed);
	}
	
	public void brake(){
		System.out.println("vehicle is stopped");
	}

}
