package com.tsconsult.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.tsconsult.test.cotroller.EmployeeController;
import com.tsconsult.test.dto.EmployeeDTO;
import com.tsconsult.test.model.Employee;
import com.tsconsult.test.service.EmployeeService;



public class TestApplicationTests extends AbstractTest {
	
	   @Override
	   @Before
	   public void setUp() {
	      super.setUp();
	   }
	   @Test
	   public void getEmployeeList() throws Exception {
	      String url = "/api/employee/all";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(url)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      EmployeeDTO[] employeelist = super.mapFromJson(content, EmployeeDTO[].class);
	      assertTrue(employeelist.length > 0);
	   }
	   
	   
	   @Test
	   public void createEmployee() throws Exception {
	      String url = "/api/employee/create";
		  Employee  emp = new Employee("Skander","Khdhiri","skander@gmail.com","1111111111","06/06/1996","Paris");
		  EmployeeDTO empDto= new EmployeeDTO(emp);
	      String inputJson = super.mapToJson(empDto);
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(url)
	         .contentType(MediaType.APPLICATION_JSON_VALUE)
	         .content(inputJson)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	   }
	
	



}
	
