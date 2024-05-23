package com.example.spring.jdbc.dao;

import java.util.List;

import com.example.spring.jdbc.model.Employee;

public interface EmpDAO {
	Employee getEmployeeById(int id);

	List<Employee> getAllEmployees();

	boolean deleteEmployee(Employee e);

	boolean updateEmployee(Employee e);

	boolean createEmployee(Employee e);
}
