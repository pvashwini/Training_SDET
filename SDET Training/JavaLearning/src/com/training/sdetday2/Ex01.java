package com.training.sdetday2;

public class Ex01 {

	public static void main(String[] args) {
		try{
		int arr[] = new int[5];
		//arr[55]=35;
		}catch(NegativeArraySizeException nase){
			System.out.println(nase);
		}
		catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println(aioobe);
		}
		
		try{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		
		int num = num1/num2;
		System.out.println(num);
		}
		catch(ArithmeticException ae){
			System.out.println("Division problem:"+ae);
		}
		
		catch(NumberFormatException nfe){
			System.out.println("Format error"+nfe);
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	   System.out.println("Some other business logic");

	}

}
