package com.training.sdetday2;

public class Car extends Vehicle {
	
	@Override
	public void move() {
		System.out.println("My car is moving @"+this.getSpeed());
	}
	
	@Override
	public void brake() {
		System.out.println("Car is stopped");
	}

	private int doors;
	private int capacity;
	public Car(int doors,int capacity,int speed){
		super(speed);
		this.doors=doors;
		this.capacity=capacity;
	}
	public void doors(int noOfDoors){
		System.out.println("My car has"+noOfDoors+"doors");
	}
	
	public void fuelCapacity(int noOfLtrs){
		System.out.println("car has"+noOfLtrs+"capacity");
		
	}
	
/*	public void move()
	{
		System.out.println("Vehicle car is Moving");
	}*/

}
