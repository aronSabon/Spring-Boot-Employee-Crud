package com.broadway.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.broadway.springboot.model.Address;
import com.broadway.springboot.model.Employee;
import com.broadway.springboot.service.AddressService;
import com.broadway.springboot.service.DepartmentService;
import com.broadway.springboot.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@Autowired
	AddressService as;
	@Autowired
	DepartmentService ds;
	@GetMapping("/Employee")
	private String getEmployee(Model model) {
		model.addAttribute("dList", ds.getAllDepartment());
		return "Employee";
	}
	@PostMapping("/Employee")
	private String postEmployee(@ModelAttribute Employee employee,@ModelAttribute Address address) {
		es.addEmployee(employee);
		as.addAddress(address);
		return "redirect:/Employee";
	}
	@GetMapping("/EmployeeList")
	private String getEmployeeList(Model model) {
		model.addAttribute("eList", es.getAllEmployee());
		return "EmployeeList";
	}
	@GetMapping("/Delete/Employee")
	private String deleteEmployee(@RequestParam int id) {
		es.deleteEmployeeById(id);
		return "redirect:/EmployeeList";
	}
	@GetMapping("/Edit/Employee")
	private String editEmployee(@RequestParam int id, Model model) {
		model.addAttribute("eModel", es.getEmployeeById(id));
		return "EmployeeEdit";
	}
	@PostMapping("/Update/Employee")
	private String updateEmployee(@ModelAttribute Employee employee) {
		es.updateEmployee(employee);
		return "redirect:/EmployeeList";
	}
	@GetMapping("/View/Employee")
	private String viewEmployee(@RequestParam int id, Model model) {
		model.addAttribute("eModel", es.getEmployeeById(id));
		return "EmployeeView";
	}
}
