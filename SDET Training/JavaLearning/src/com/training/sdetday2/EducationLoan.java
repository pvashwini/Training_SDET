package com.training.sdetday2;

public class EducationLoan extends Loan {

	public EducationLoan(int loanAmount) {
		super(loanAmount);
	}
	
	@Override
	public double getROI() {
		
		return 6.0;
	}

}
