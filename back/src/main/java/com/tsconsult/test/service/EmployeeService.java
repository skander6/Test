package com.tsconsult.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsconsult.test.dto.EmployeeDTO;
import com.tsconsult.test.model.Employee;
import com.tsconsult.test.persistence.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<EmployeeDTO> getAll(){
		List<EmployeeDTO>  dtos = new ArrayList<EmployeeDTO>();
		List<Employee>   list = this.employeeRepository.findAll();
		
		for (Employee employee : list) {
			dtos.add(new EmployeeDTO(employee));
		}
		return dtos;
		
	}
    
	public Employee create(EmployeeDTO employeeDTO) {
		return this.employeeRepository.save(
				new Employee(employeeDTO.getFirstName(),employeeDTO.getLastName(),employeeDTO.getEmail(),employeeDTO.getTel(),employeeDTO.getAdress(),employeeDTO.getBirthDate()));
		
	}
}
