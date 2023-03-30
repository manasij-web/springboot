package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Entity
public class Product {
	@Id
	@GeneratedValue
	int pid;
	
	@NotNull
	//@Column(name="pname",length=20)
	@Size(min =2, message = "name should have atleast 2 character")
	private String pname;
	
	//@Size(min=2)
	@Min(1)
	@PositiveOrZero
	private int quantity; 
	
	//@Range(min=1, max=90)
	@PositiveOrZero
	@Min(1)
	@NotNull(message=" No product Price ")
	private int price;
	
	public String lastName;
	@Column(name="email_id",unique=true,length=30)
	@NotNull
	@Email(message="Email  is not valid!")
	public String adminEmailId;
	
	@Column(name="password",length=20)
	@NotNull
	@Size(min=8, message="Password length must be 8 and contain uppercase,lowercase,digits")
	@Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
	public String adminPassword;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAdminEmailId() {
		return adminEmailId;
	}
	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	
	
	
	

}
