package com.training.sdetday3.collection;

import java.util.Vector;

public class CollectionEx03 {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>(5,7);
		
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
		vector.add("Kumar");
		vector.add("one");
		vector.add("two");
		vector.add("three");
		vector.add("four");
		vector.add("five");
		vector.add("Kumar");
		vector.add("one");
		vector.add("two");
		vector.add("three");
		vector.add("four");
		vector.add("five");
		vector.add("Kumar");
		vector.add("one");
		vector.add("two");
		vector.add("two");
		vector.add("two");
		vector.add("two");
		vector.add("three");
		vector.add("four");
		vector.add("five");
		
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
	

	}

}
 