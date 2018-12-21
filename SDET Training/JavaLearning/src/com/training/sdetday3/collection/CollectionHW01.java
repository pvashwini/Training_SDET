package com.training.sdetday3.collection;

import java.util.Iterator;
import java.util.Stack;

//Program to handle Stack
public class CollectionHW01 {

	public static void main(String[] args) {
		
		Stack<String> stk = new Stack<>();
		
		stk.push("Ashwini");
		stk.push("Peter");
		stk.push("Karen");
		
		
		
		System.out.println(stk);
		System.out.println("Top on the stack"+stk.peek());
		System.out.println("Item to be removed is the last one entered"+stk.pop());
	
		
		System.out.println(stk);
		
		   Iterator itr = stk.iterator();
	        
	        while(itr.hasNext()){
	        	System.out.println(itr.next());
		
	}

	}}
