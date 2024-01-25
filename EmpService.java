package com.hefshine.demo.service;

import com.hefshine.demo.Model.Employee;

public interface EmpService {

	public Employee getEmp(int id);
	public Employee saveEmp(Employee employee);
	public void deleteEmp(int id);
	public Employee updateEmp(Employee employee);
	
}
