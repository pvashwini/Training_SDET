package com.training.sdetday2;

public class VehicleClient {
	
	public static void display(Vehicle vehicle){
		System.out.println("--------------");
		vehicle.move();
		vehicle.brake();
		if(vehicle instanceof Car){
			((Car)vehicle).doors(2);
			((Car)vehicle).fuelCapacity(40);
		}
		
		else if(vehicle instanceof Truck){
			((Truck)vehicle).load(3000);
		}
	}

	public static void main(String[] args) {
		
		Vehicle [] vehicles = new Vehicle[5];
		vehicles[0] = new Car(4,40,100);
		vehicles[1] = new Truck(5000,80);
		vehicles[2] = new Car(5,50,80);
		vehicles[3] = new Truck(4000,90);
		vehicles[4] = new Truck(4000,80);
		
	/*	for(int i=0;i<vehicles.length;i++){
			display(vehicles[i]);
		}*/
		
		for(Vehicle temp:vehicles){
			display(temp);
		}
		
		
		//singleOjbectCall();
		

	}

	private static void hi() {
		System.out.println("Hi");
	}

	private static void singleOjbectCall() {
		Vehicle vehicle = new Car(4,40,70);
		display(vehicle);
		
		System.out.println("---------------");
		vehicle = new Truck(4000,75);
		display(vehicle);
/*		vehicle.move();
		
		((Car)vehicle).doors(2);
		((Car)vehicle).fuelCapacity(40);
		
		System.out.println("---------------------");
		
		vehicle = new Truck();
		vehicle.move();
		vehicle.brake();
		((Truck)vehicle).load(40);*/
	}

}
