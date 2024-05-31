package com.broadway.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.broadway.springboot.model.Department;
import com.broadway.springboot.service.DepartmentService;
@Controller
public class DepartmentController {
	@Autowired
	DepartmentService ds;
	@GetMapping("/Department")
	private String getDepartment() {
		return"Department";
	}
	@PostMapping("/Department")
	private String postDepartment(@ModelAttribute Department department) {
		ds.addDepartment(department);
		return"redirect:/Department";
	}

	@GetMapping("/DepartmentList")
	private String getDepartmentList(Model model) {
		model.addAttribute("dList",ds.getAllDepartment());
		return"DepartmentList";
	}
	@GetMapping("/Delete/Department")
	private String deleteDepartment(@RequestParam int id) {
		ds.deleteDepartmentById(id);
		return"redirect:/DepartmentList";
	}
	@GetMapping("/Edit/Department")
	private String editDepartment(@RequestParam int id, Model model) {
		model.addAttribute("dModel", ds.getDepartmentById(id));
		return"DepartmentEdit";
	}
	@PostMapping("/Update/Department")
	private String updateDepartment(@ModelAttribute Department department) {
		ds.updateDepartment(department);
		return"redirect:/DepartmentList";
	}
}
