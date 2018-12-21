package com.training.sdetday2;

import java.util.Arrays;

public class SortObjects {
	
	public static void main(String[] args) {
		int[] arr = {12,3,43,45,23,22,666,10,44};
		
		for(int temp:arr){
			System.out.print(temp+" ");
			
		}
		
		System.out.println();
		System.out.println("-----------");
		
		Arrays.sort(arr);
		
		for(int temp:arr){
			System.out.print(temp+" ");
		}
		
		
		String[] sarr = {"hello","how","am","today"};
		
		System.out.println();
		for(String temp:sarr){
			System.out.print(temp+" ");
			
		}
		
		System.out.println();
		System.out.println("-----------");
		
		Arrays.sort(sarr);
		
		for(String temp:sarr){
			System.out.print(temp+" ");
		}
	}

}
