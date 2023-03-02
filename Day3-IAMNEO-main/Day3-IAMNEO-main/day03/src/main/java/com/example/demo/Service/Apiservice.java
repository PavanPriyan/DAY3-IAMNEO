package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepo.EmployeeRepo;
import com.example.demo.Models.Employee;

@Service
public class Apiservice {
	@Autowired
	EmployeeRepo repo;
	public Optional<Employee> getdetails(int id2)
	{
		return repo.findById(id2);
	}

}
