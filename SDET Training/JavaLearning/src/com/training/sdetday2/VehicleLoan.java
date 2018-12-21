package com.training.sdetday2;

public class VehicleLoan extends Loan {

	public VehicleLoan(int loanAmount) {
		super(loanAmount);
	}
	@Override
	public double getROI() {
		
		return 5.5;
	}

}
