package com.training.sdetday2;



public class Account implements Comparable<Account>{
	
	private int accountId;
	private String name;
	private double balanace;
	
	private static int count=100;
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", balanace=" + balanace + "]";
	}

	public Account(String name, double balanace) {
		super();
		this.accountId = count++;
		this.name = name;
		this.balanace = balanace;
	}

	public double getBalanace() {
		return balanace;
	}

	public void setBalanace(double balanace) {
		this.balanace = balanace;
	}

	public int getAccountId() {
		return accountId;
	}

	public String getName() {
		return name;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public int compareTo(Account o) {
		//return o.getAccountId()- this.getAccountId();
		//return this.getName().compareTo(o.getName());
		return o.getName().compareTo(this.getName());
	}
	

	

}
