package com.cg.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cg.exception.ResourceNotFoundException;
import com.cg.model.Employee;
import com.cg.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	
	public Employee getEmployeeById(Long employeeId)
			throws ResourceNotFoundException {
		
		Optional<Employee> optional = employeeRepository.findById(employeeId);
		
		if(! optional.isPresent())
		{
			throw new ResourceNotFoundException("Employee not found for this id :: " + employeeId);
		}
		Employee employee = optional.get();
		return employee;
	}

	
	public Employee createEmployee( Employee employee) {
		return employeeRepository.save(employee);
	}

	
	public Employee updateEmployee( Long employeeId,
			 Employee employeeDetails) throws ResourceNotFoundException {
		
Optional<Employee> optional = employeeRepository.findById(employeeId);
		
		if(! optional.isPresent())
		{
			throw new ResourceNotFoundException("Employee not found for this id :: " + employeeId);
		}
		Employee employee = optional.get();
		

		employee.setEmailId(employeeDetails.getEmailId());
		employee.setLastName(employeeDetails.getLastName());
		employee.setFirstName(employeeDetails.getFirstName());
		
		final Employee updatedEmployee = employeeRepository.save(employee);
		return updatedEmployee;
	}


	public Employee deleteEmployee( Long employeeId)
			throws ResourceNotFoundException {
		
Optional<Employee> optional = employeeRepository.findById(employeeId);
		
		if(! optional.isPresent())
		{
			throw new ResourceNotFoundException("Employee not found for this id :: " + employeeId);
		}
		Employee employee = optional.get();
		

		employeeRepository.delete(employee);
		
		return employee;
	}

}
