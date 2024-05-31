package com.broadway.springboot.service;

import java.util.List;

import com.broadway.springboot.model.Address;
import com.broadway.springboot.model.Employee;

public interface EmployeeService {
	void addEmployee(Employee employee);
	void deleteEmployeeById(int id);
	void updateEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(int id);
	List<Address> getAllAddress();
}
