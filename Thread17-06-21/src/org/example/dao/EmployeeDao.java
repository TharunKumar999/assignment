package org.example.dao;

import java.sql.SQLException;
import java.util.List;

import org.example.employee.Employee;

public interface EmployeeDao {
	
	public Employee createEmployee(Employee employee) throws SQLException;
	
	public List<Employee> getAllEmployees()throws SQLException;
	
	public List<Employee> findById(Integer id)throws SQLException;
	
	public Employee updateEmployee(Integer id)throws SQLException,EmployeeNotFoundException;
	public Employee deleteEmployee(Integer id)throws SQLException,EmployeeNotFoundException;

	List<Employee> deleteId(Integer id) throws SQLException;
}