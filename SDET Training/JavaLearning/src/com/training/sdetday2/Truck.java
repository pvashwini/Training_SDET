package com.training.sdetday2;

public class Truck extends Vehicle{
	
	private int pounds;
	Truck(int pounds,int speed){
		super(speed);
		this.pounds=pounds;
	}
	

	@Override
	public void move() {
		
		System.out.println("My truck is moving @"+this.getSpeed());
	}


	@Override
	public void brake() {
		
		System.out.println("Truck is stopped");
	}


	public void load(int noOfPounds){
		System.out.println("truck has"+noOfPounds+"load");
	}
}
