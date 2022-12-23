package com.example.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.emp.entity.Employee;
import com.example.emp.repository.EmpRepo;

public class EmpService {

	@Autowired
	private EmpRepo repo;
	
	public void addEmp(Employee e)
	{
		repo.save(e);
	}

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	public Empolyee getEmpById(int id)
	{
		Optional<Employee> e=repo.findById();
		if(e.isPresent())
		{
			return e.get();
		}
		return null;
	}
}
