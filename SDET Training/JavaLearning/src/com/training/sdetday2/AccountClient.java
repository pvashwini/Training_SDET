package com.training.sdetday2;

import java.util.Arrays;
import java.util.Comparator;

public class AccountClient {
	public static void main(String[] args) {
		
		Account [] accs = new Account[5];
		
		accs[0] = new Account("Frank", 5000);
		accs[1] = new Account("tranky", 4000);
		accs[2] = new Account("Brany", 1000);
		accs[3] = new Account("ara", 5030);
		accs[4] = new Account("Frnk", 5100);
	
		//Arrays.sort(accs);
		
		Comparator<Account> compareBasedOnBalanace =
				new Comparator<Account>(){

					@Override
					public int compare(Account o1, Account o2) {
						
						return (int) (o1.getBalanace() - o2.getBalanace());
					}
			
		};
		
		Arrays.sort(accs,compareBasedOnBalanace);
		
		Arrays.sort(accs,new Comparator<Account>(){

			@Override
			public int compare(Account o1, Account o2) {
		
				return (int) (o1.getBalanace() - o2.getBalanace());
			}
			
		});
		
		//naveenks.com/m/messages
		Arrays.sort(accs,(o1,o2)-> (int)(o1.getBalanace()-o2.getBalanace()));
	
	for ( Account tmp:accs ){
		System.out.println(tmp);
	}

	}
}

