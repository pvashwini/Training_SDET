package com.training.sdetday1;

//Employee is a person
public class Employee extends Person{
	
     private double employeeSalary;
     private String projectName;
     
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		
		return "Employee [employeeSalary=" + employeeSalary + ", projectName=" + projectName + "]" +super.toString();
	}
     
	
     

}
