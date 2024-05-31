package com.broadway.springboot.service;

import java.util.List;


import com.broadway.springboot.model.Department;

public interface DepartmentService {
void addDepartment(Department department);
void deleteDepartmentById(int id);
void updateDepartment(Department department);
Department getDepartmentById(int id);
List<Department> getAllDepartment();
}
