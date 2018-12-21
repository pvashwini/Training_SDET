package com.training.sdetday3.set;

public class Emp implements Comparable<Emp>{
	
	private int empid;
	private String empName;
	private double empSal;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Emp(int empid, String empName, double empSal) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	public Emp(){
		
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	@Override
	public int hashCode(){
		return this.empName.charAt(0);
	}
	@Override
	public boolean equals(Object obj) {
		Emp emp =(Emp) obj;
		if(this.empid==emp.empid &&this.empName.equals(emp.getEmpName()) && this.empSal ==emp.empSal)
			return true;
		else 
			 return false;
		
	}
	@Override
	public int compareTo(Emp o) {
		return this.empid - o.getEmpid();
	}


}
