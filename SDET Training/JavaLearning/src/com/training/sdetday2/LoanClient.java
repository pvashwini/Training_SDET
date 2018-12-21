package com.training.sdetday2;

public class LoanClient {

	public static void main(String[] args) {
        
		Loan loan = new HomeLoan(1000);
		showLoan(loan);
		
		loan = new EducationLoan(2000);
		showLoan(loan);
		
		loan = new VehicleLoan(1300);
		showLoan(loan);
		
		
		

	}

	private static void showLoan(Loan loan) {
		
		//Select code - ( refactor ) - Extract method
		System.out.println("Name"+loan.getName());
		System.out.println("Address"+loan.getAddress());
		System.out.println("ROI"+loan.getROI());
		System.out.println("Amount"+loan.getLoanAmount());
	}

}
