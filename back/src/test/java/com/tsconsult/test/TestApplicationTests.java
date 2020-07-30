package com.tsconsult.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsconsult.test.cotroller.EmployeeController;
import com.tsconsult.test.dto.EmployeeDTO;
import com.tsconsult.test.model.Employee;
import com.tsconsult.test.service.EmployeeService;


@SpringBootTest
class TestApplicationTests {
    
	@Autowired
	private MockMvc mockMvc;
	
	@InjectMocks
	private EmployeeController employeeController;
	
	@Before
	public void setUp() throws Exception {
		mockMvc= MockMvcBuilders.standaloneSetup(employeeController).build();
		
	}
	
	@Test
	void createEmployeeTest() {}

	

}
