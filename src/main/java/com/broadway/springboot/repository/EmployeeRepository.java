package com.broadway.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.broadway.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
