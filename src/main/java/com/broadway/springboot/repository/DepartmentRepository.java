package com.broadway.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.broadway.springboot.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
