package com.hefshine.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hefshine.demo.Model.Employee;
import com.hefshine.demo.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	EmpService empService;
	
	@GetMapping("emp/{id}")
	public Employee getEmp(@PathVariable("id")int id) {
		return empService.getEmp(id);
	}
	
	@PostMapping("e")
	public Employee saveEmp(@RequestBody Employee employee) {
		return empService.saveEmp(employee);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteEmp(@PathVariable ("id")int id)
	{
		this.empService.deleteEmp(id);
	
	}
	@PutMapping("employee")
	public Employee updateEmp(@RequestBody Employee employee) {
		return empService.updateEmp(employee);
	}
	  
}
