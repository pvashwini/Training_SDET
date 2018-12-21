package com.training.sdetday3.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		
		Set<Emp> set = new HashSet<>();
		
		set.add(new Emp(101,"kumar",33444));
		set.add(new Emp(102,"aum",33474));
		set.add(new Emp(103,"kumar",32444));
		set.add(new Emp(104,"karar",3344));
		set.add(new Emp(101,"kumar",33444));
		
		for(Emp temp:set){
			System.out.println(temp +","+temp.hashCode());
			
		}

	}

}
