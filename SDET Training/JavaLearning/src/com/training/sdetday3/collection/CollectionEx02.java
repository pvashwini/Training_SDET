package com.training.sdetday3.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionEx02 {

	public static void main(String[] args) {
		//List<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<>();
		
		list.add("Harry");
		list.add("Suresh");
		list.add("Brain");
		list.add("Peter");
		list.add("Sriram");
		list.add("Raj");
		
		
		for(String temp:list){
			System.out.println(temp);
		}
		
		System.out.println(list);
		System.out.println("Size" + list.size());
		
		list.remove("Harry");
		System.out.println(list);
		System.out.println("Size" + list.size());
		
		System.out.println(list.contains("Suresh"));
		System.out.println(list.contains("radikha"));
		
		List<String> sublist = list.subList(2, list.size());
		System.out.println(sublist);
		
		//iteratorexample(list);
		
		

	}

	private static void iteratorexample(List<String> list) {
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
 