package com.tsconsult.test.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsconsult.test.dto.EmployeeDTO;
import com.tsconsult.test.model.Employee;
import com.tsconsult.test.service.EmployeeService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/create")
	public Employee create(@RequestBody EmployeeDTO employeeDTO) {
		return this.employeeService.create(employeeDTO);
		
	}
	
	@GetMapping("/all")
	public List<EmployeeDTO> getAll(){
		return this.employeeService.getAll();
		
	}

}
