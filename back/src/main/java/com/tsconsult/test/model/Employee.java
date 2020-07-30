package com.tsconsult.test.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Employee")
public class Employee {
	
	@Id
	private String id;
	

    @Field(value = "First_Name")
	private String firstName;
    
    @Field(value = "Last_Name")
	private String lastName;
    
	@Indexed(unique = true)
    @Field(value = "Email")
	private String email;
	
	@Field(value = "Tel")
	private String tel;
	
	@Field(value = "Adress")
	private String adress;
	
	@Field(value = "Birth_Date")
	private String birthDate;
	
	public Employee() {}
	
	

	public Employee(String firstName, String lastName, String email, String tel, String adress, String birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.tel = tel;
		this.adress = adress;
		this.birthDate = birthDate;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
