package com.training.sdetday1;

public class InherienceEmpEx {
	
	public static void main(String[] args) {
		
		//inheretmethod();
		
		Person p = new Employee();
		p.setPersonId(101);
		p.setPersonName("sreeram");
		((Employee)p).setEmployeeSalary(20000);
		((Employee)p).setProjectName("Testing Automation");
		
		System.out.println(p.toString());
		
	}

	private static void inheretmethod() {
		Employee emp = new Employee();
		Customer cust1 = new Customer();
	    emp.setPersonId(101);
	    emp.setPersonName("Sreeram");
	    emp.setEmployeeSalary(1000);
	    emp.setProjectName("Automation Testing");
	    
	    System.out.println(emp);   //emp.toString()
	    
	    cust1.setPersonId(102);
	    cust1.setPersonName("Sreelatha");
	    cust1.setIncome(10000);
	    
	    System.out.println(cust1);//cust1.toString()
	}

}
