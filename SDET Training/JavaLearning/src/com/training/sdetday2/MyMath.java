package com.training.sdetday2;

//Static variables are available first
//Static blocks are executed first
//Static methods are loaded first
public class MyMath {
    static int i=10;
	static int add(int num1,int num2){
		return num1+num2;
		
	}
	static {
		System.out.println("Hey this is static block1");
		System.out.println(i);
	}
	
	static{
		System.out.println("Hey i am second static block");
	}
	int sub(int num1,int num2){
		return num1-num2;
	}
	public static void main(String[] args) {
		//MyMath m = new MyMath();
		//System.out.println(m.add(10,20));
		System.out.println(add(10,20));
        
	}

}
