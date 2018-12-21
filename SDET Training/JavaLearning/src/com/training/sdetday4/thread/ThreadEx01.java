package com.training.sdetday4.thread;

class MyBusinessLogic extends Thread {

	// simulate some time
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("Value of i" + i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " " + "Exiting");
	}
}

public class ThreadEx01 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());

	
	
	MyBusinessLogic mb1 = new MyBusinessLogic();
	MyBusinessLogic mb2 = new MyBusinessLogic();
	MyBusinessLogic mb3 = new MyBusinessLogic();
    mb1.start();
    mb2.start();
    mb3.start();
    
    try {
		mb1.join();
		mb2.join();
		mb3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    System.out.println("End of main");
	
	

}
}
