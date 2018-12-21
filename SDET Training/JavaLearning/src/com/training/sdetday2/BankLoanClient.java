package com.training.sdetday2;

public class BankLoanClient {

	public static void main(String[] args) {
		
		BankLoan bankloan = new Personal();
		display(bankloan);
		
		System.out.println("---------------");
		
		bankloan = new HouseLoan();
		display(bankloan);
		
	}

	private static void display(BankLoan bankloan) {
		bankloan.foreclosure();
		bankloan.loanAmount(3500);
		bankloan.repay(2200);
	}
}
