package com.tsconsult.test.dto;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

import com.tsconsult.test.model.Employee;

public class EmployeeDTO {
	
  private String firstName;
	    
  private String lastName;
	    
  private String email;
		
  private String tel;
		
  private String adress;

  private String birthDate;
  
  

public EmployeeDTO() {

}

public EmployeeDTO(Employee employee) {
	
	this.firstName=employee.getFirstName();
	this.lastName=employee.getLastName();
	this.email=employee.getEmail();
	this.adress=employee.getAdress();
	this.tel=employee.getTel();
	this.birthDate=employee.getBirthDate();
	}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public String getBirthDate() {
	return birthDate;
}

public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
}
  
  

}
