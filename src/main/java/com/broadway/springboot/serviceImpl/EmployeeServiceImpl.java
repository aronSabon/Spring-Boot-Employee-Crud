package com.broadway.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.broadway.springboot.model.Address;
import com.broadway.springboot.model.Employee;
import com.broadway.springboot.repository.AddressRepository;
import com.broadway.springboot.repository.EmployeeRepository;
import com.broadway.springboot.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
EmployeeRepository rs;
@Autowired
AddressRepository as;
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		rs.save(employee);
	}
	

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		rs.deleteById(id);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		rs.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return rs.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return rs.findById(id).get();
	}

	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return as.findAll();
	}

}
