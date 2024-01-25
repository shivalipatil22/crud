package com.hefshine.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hefshine.demo.Model.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer> {

}
