package com.jdbc.details;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.model.Employee;
import com.jdbc.util.DatabaseConnection;

public class EmployeeDetailsImplementation implements EmployeeDetails {

	  Connection connection = DatabaseConnection .getConnection();

	@Override
	public int add(Employee emp) throws SQLException {

		String query = "insert into Employee(emp_name, " + "emp_address, "+"emp_experience,"+"emp_salary) VALUES (?, ?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, emp.getEmp_name());
		ps.setString(2, emp.getEmp_address());
		int n = ps.executeUpdate();
		return n;
	}

	@Override
	public void delete(int id) throws SQLException {
		String query = "delete from Employee where emp_id =?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	@Override
	public Employee getEmployee(int id) throws SQLException {

		String query = "select * from Employee where emp_id= ?";
		PreparedStatement ps = connection.prepareStatement(query);

		ps.setInt(1, id);
		Employee emp = new Employee();
		ResultSet rs = ps.executeQuery();
		boolean check = false;

		while (rs.next()) {
			check = true;
			emp.setEmp_id(rs.getInt("emp_id"));
			emp.setEmp_name(rs.getString("emp_name"));
			emp.setEmp_address(rs.getString("emp_address"));
		}

		if (check == true) {
			return emp;
		} else
			return emp;
	}

	@Override
	public List<Employee> getEmployees() throws SQLException {
		String query = "select * from Employee";
		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		List<Employee> list = new ArrayList<Employee>();

		while (rs.next()) {
			Employee emp = new Employee();
			emp.setEmp_id(rs.getInt("emp_id"));
			emp.setEmp_name(rs.getString("emp_name"));
			emp.setEmp_address(rs.getString("emp_address"));
			list.add(emp);
		}
		return list;
	}

	@Override
	public void update(Employee emp) throws SQLException {

		String query = "update Employee set emp_name=?, " + " emp_address= ?, " + " emp_experience= ?, " + " emp_salary= ? where emp_id = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, emp.getEmp_name());
		ps.setString(2, emp.getEmp_address());
		ps.setInt(3, emp.getEmp_id());
		ps.executeUpdate();
	}
}
