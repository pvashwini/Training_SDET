package com.training.client;

import com.training.dao.EmployeeDAO;
import com.training.entity.Employee;
import com.training.standards.IEmployeeDAO;

public class EmployeeClient {

	public static void main(String[] args) {
		
		Employee employee = new Employee(101,"Prasanna",8989,"prasanna@testing.com");
		Employee employee1 = new Employee(102,"Pras",8990,"pras@testing.com");
		Employee employee2 = new Employee(103,"Prabs",8991,"prabs@testing.com");
		Employee employee3 = new Employee(104,"Prasanth",892,"prasanth@testing.com");
		
		
		IEmployeeDAO dao = new EmployeeDAO();
		
		//boolean insertFlag = dao.insertEmployee(employee3);
	//	System.out.println(employee.getEmpId());
	//dao.deleteEmployee(employee.getEmpId());
//	System.out.println(dao.deleteEmployee(employee1.getEmpId()));
		
	//System.out.println(dao.updateEmployeeSalary(103, 10000));
		
	//	System.out.println(dao.getEmployee(101));
		
		dao.getAllEmps().forEach(System.out :: println);
		
		//<condition>?"<TRUE>":"<FALSE>"
		/*System.out.println(insertFlag
				?"Record deleted":
					"Sorry Record Not deleted");*/
		
				           

	}

}
