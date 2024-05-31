package com.broadway.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="dept_tbl")
public class Department {
	@Id
	@GeneratedValue
	private int id;
private String departmentName;
private String departmentHead;   
private String departmentPhone;
}   
