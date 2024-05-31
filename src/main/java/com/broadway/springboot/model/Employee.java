package com.broadway.springboot.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="emp_tbl")

public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dob;
	private String phone;
	private String email;
	private String company;
	private String post;
	private int Salary;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate joinDate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="adr_id")
	private Address address;
	@ManyToMany
	private List<Department> department;
	@CollectionTable
	@ElementCollection
	private List<String> projects;
	

}
