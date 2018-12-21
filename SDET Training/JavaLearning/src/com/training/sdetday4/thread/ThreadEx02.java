package com.training.sdetday4.thread;

class otherclass{}

class MyClass extends otherclass implements Runnable{

	 private Thread t;
	 private String threadName;
	 
	 public MyClass(){}
	 
	 public MyClass(String threadName,int priority){
		 t = new Thread(this,threadName);
		 t.setPriority(priority);
		 ///This OS level thread is created and control is given for run()
		 //in between it goes to scheduler
		 t.start();
		 
	 }
	@Override
	public void run() {
		for(int i=0;i<500;i++){
			print(i);
			
		}
		System.out.println("Thread"+" "+Thread.currentThread().getName()+"exiting");
	}
	
	public void print(int i){
		System.out.println("i value in"+Thread.currentThread().getName()+" "+i);
	}
	
}


public class ThreadEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass m1 = new MyClass("William", Thread.NORM_PRIORITY+1);
		MyClass m2 = new MyClass("Koh", Thread.NORM_PRIORITY+2);
		MyClass m3 = new MyClass("Ashu", Thread.MAX_PRIORITY);
		
		//MyClass m4 = new MyClass();
	    //Thread t = new Thread(m4);
		Thread t  = new Thread(new MyClass());
		t.setName("Ashwini");
		t.setPriority(10);
		t.start();

	}

}
