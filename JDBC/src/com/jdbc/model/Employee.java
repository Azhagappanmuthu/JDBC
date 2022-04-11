package com.jdbc.model;

public class Employee {
	

	int emp_id;
	String emp_name;
	String emp_address;
	int emp_experience;
	float emp_salary;
	
	public Employee() {}
	
	public Employee(String emp_name,String emp_address,int emp_experience,float emp_salary) {
		
		this.emp_name = emp_name;
		this.emp_address = emp_address;
		this.emp_experience = emp_experience;
		this.emp_salary = emp_salary; 
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public int getEmp_experience() {
		return emp_experience;
	}

	public void setEmp_experience(int emp_experience) {
		this.emp_experience = emp_experience;
	}

	public float getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(float emp_salary) {
		this.emp_salary = emp_salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_address=" + emp_address
				+ ", emp_experience=" + emp_experience + ", emp_salary=" + emp_salary + "]";
	}
	
	

}
