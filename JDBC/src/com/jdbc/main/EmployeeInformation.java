package com.jdbc.main;

import java.sql.SQLException;
import java.util.List;

import com.jdbc.details.EmployeeDetailsImplementation;
import com.jdbc.model.Employee;

public class EmployeeInformation  {
	
	
	public static void main(String args[])throws SQLException {
		
		Employee emp = new Employee();
		emp.setEmp_name("Arun");
		emp.setEmp_address("madurai");
		emp.setEmp_experience(5);
		emp.setEmp_salary(20000);
		EmployeeDetailsImplementation empDetails = new EmployeeDetailsImplementation ();
		
		
		empDetails.add(emp);
		
		Employee employee = empDetails.getEmployee(1);
		System.out.println(employee.getEmp_id()+ ""
				+ employee.getEmp_name()+""
				+ employee.getEmp_address()+""
				+employee.getEmp_experience()+""
				+employee.getEmp_salary());
		
		List<Employee> list = empDetails.getEmployees();
		for (Employee allEmp : list) {
			System.out.println(allEmp);
		}
		
		Employee tempEmployee = empDetails.getEmployee(1);
		tempEmployee.setEmp_address("karaikudi");
		empDetails.update(tempEmployee);
		
		
		empDetails.delete(1);
		
		

}
	
	
}
