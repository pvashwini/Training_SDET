package com.training.sdetday4.trail;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class assignmentt01 {
	
	static Map<String, String[]> myMap = new HashMap<>();
	
	  static {
		  
	        myMap.put("hello",new String[] {"ola","namaste","Bonjour"});
	        myMap.put("goodmorning",new String[] {"Hyv‰‰ huomenta","Tere hommikust"});
	        myMap.put("goodnight",new String[] {"Bonne nuit","Slapwel"});
	    }
	  

   public void display_elements(String choice1){
			for(String s:myMap.get(choice1)){
	            System.out.print(s+" ");
	        }
			System.out.println();
   }

	public static void main(String[] args) {
		assignmentt01 test = new assignmentt01();
		
		Scanner sc = new Scanner(System.in);
		String choice;
		try {
			choice = null;
		} 
		finally{
			System.out.println("Hi");
		}
		
		System.out.println("Keys present in the MAP");
		Set set = myMap.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry element = (Entry) itr.next();
			System.out.print(element.getKey()+" ");
			
		}
		System.out.println();
		System.out.println("Enter quit to Stop");
		while(choice!="quit")
		{
		
		System.out.println("Enter key");
		choice = sc.next();
		test.display_elements(choice);
		}
		
	   sc.close();
	
	}

	}


