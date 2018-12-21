package com.training.sdetday2;

public class HouseLoan implements BankLoan {
	
	@Override
	public void loanAmount(int amount) {
		System.out.println("Home loan applied"+amount);
		
	}

	@Override
	public void repay(int repayAmount) {
	    System.out.println("For Home loan repaid"+repayAmount);
		
	}

	@Override
	public void foreclosure() {
		System.out.println("There shall be 3% foreclosure");
		
	}

}
