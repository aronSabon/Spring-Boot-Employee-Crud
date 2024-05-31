package com.broadway.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.broadway.springboot.model.Department;
import com.broadway.springboot.repository.DepartmentRepository;
import com.broadway.springboot.service.DepartmentService;
@Service

public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository dr;

	@Override
	public void addDepartment(Department department) {
		// TODO Auto-generated method stub
		dr.save(department);
	}

	@Override
	public void deleteDepartmentById(int id) {
		// TODO Auto-generated method stub
		dr.deleteById(id);
	}

	@Override
	public void updateDepartment(Department department) {
		// TODO Auto-generated method stub
		dr.save(department);
	}

	@Override
	public Department getDepartmentById(int id) {
		// TODO Auto-generated method stub
		return dr.findById(id).get();
	}

	@Override
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

}
