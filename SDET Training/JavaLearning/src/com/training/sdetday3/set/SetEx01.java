package com.training.sdetday3.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		
		Set<String> mySet = new HashSet<>();
		
		System.out.println(mySet.add("Raj"));
		System.out.println(mySet.add("Britt"));
		System.out.println(mySet.add("Raj"));
		System.out.println(mySet.add("Britt"));
		
		System.out.println(mySet.size());
		System.out.println(mySet);

	}

}
