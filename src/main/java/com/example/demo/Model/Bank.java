package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bankapp")
public class Bank {
	@Id

	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	
	
	
	public String getname() {
		return name;
	}


	public void setname(String name) {
		this.name = name;
	}


	public String getpassword() {
		return password;
	}


	public void setEmployeeName(String password) {
		this.password = password;
	}




	public String getemail() {
		return email;
	}


	public void setemail(String email) {
		this.email= email;
	}


	public Bank(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	
	}


	public Bank() {
		
		
	}
}