package com.training.sdetday3.set;

import java.util.Set;
import java.util.TreeSet;

public class Treeex01 {
	public static void main(String[] args) {
		
		Set<Emp> ts = new TreeSet<>();
		
		ts.add(new Emp(101,"kumar",33444));
		ts.add(new Emp(102,"aum",33474));
		ts.add(new Emp(103,"kumar",32444));
		ts.add(new Emp(104,"karar",3344));
		ts.add(new Emp(101,"kumar",33444));
		
		for(Emp temp:ts){
			System.out.println(temp +","+temp.hashCode());
			
		}

	}

}
