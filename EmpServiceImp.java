package com.hefshine.demo.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hefshine.demo.Model.Employee;
import com.hefshine.demo.repository.EmpRepository;
import com.hefshine.demo.service.EmpService;

@Service
public class EmpServiceImp implements EmpService{

	@Autowired
	EmpRepository empRepo;
	
	@Override
	public Employee getEmp(int id) {
	
		Employee emp = empRepo.findById(id).get(); 
		return emp;
	}

	@Override
	public Employee saveEmp(Employee employee) {
		Employee emp1 = empRepo.save(employee);
		return emp1;
	}

	@Override
	public void deleteEmp(int id) {
		empRepo.deleteById(id);
		
	}

	@Override
	public Employee updateEmp(Employee employee) {
		Employee emp2 = empRepo.save(employee);
		return emp2;
	}


}
