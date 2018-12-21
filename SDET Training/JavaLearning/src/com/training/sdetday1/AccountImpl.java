package com.training.sdetday1;

public class AccountImpl {
    public static void main(String[] args) {
		Account harryAccount;
		
		//New - Its in Heap
		harryAccount= new Account();
		
	/*	harryAccount.accId = 101;
		harryAccount.accBalance =-3000;
		harryAccount.accHolderName = "Harry Peter";
		
		System.out.println("Acc Id: "+ harryAccount.accId);
		System.out.println("Acc Holder name: "+ harryAccount.accHolderName);
		System.out.println("Acc Balance: "+ harryAccount.accBalance);*/
		
		harryAccount.setAccId(101);
		harryAccount.setAccBalance(-3000);
		Name name = new Name();
		name.setFirstName("harry");
		name.setLastName("peter");
		
		//if not provided leads to null pointer exception
		harryAccount.setName(name);
		
		/*System.out.println(harryAccount.getAccId());
		System.out.println(harryAccount.getAccBalance());
		System.out.println(harryAccount.getName().getFirstName());
		System.out.println(harryAccount.getName().getLastName());*/
		
		System.out.println(harryAccount.toString());
	}
}
