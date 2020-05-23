package com.cg.service;


import java.util.List;
import java.util.Map;

import com.cg.exception.ResourceNotFoundException;
import com.cg.model.Employee;

public interface EmployeeService {

	
	public List<Employee> getAllEmployees();
	
	
	public Employee getEmployeeById(Long employeeId) throws ResourceNotFoundException ;

	
	public Employee createEmployee(Employee employee) ;

	
	public Employee updateEmployee(Long employeeId,
			Employee employeeDetails) throws ResourceNotFoundException ;

	
	public Employee deleteEmployee(Long employeeId)
			throws ResourceNotFoundException ;
}
