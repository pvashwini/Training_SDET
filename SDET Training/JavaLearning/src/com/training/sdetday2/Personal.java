package com.training.sdetday2;

public class Personal implements BankLoan {

	@Override
	public void loanAmount(int amount) {
		System.out.println("personal loan applied"+amount);
		
	}

	@Override
	public void repay(int repayAmount) {
	    System.out.println("For perosnal loan repaid"+repayAmount);
		
	}

	@Override
	public void foreclosure() {
		System.out.println("There shall be 2% foreclosure");
		
	}

}
