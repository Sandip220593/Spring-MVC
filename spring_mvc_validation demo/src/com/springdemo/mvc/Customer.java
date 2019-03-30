package com.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springdemo.mvc.validation.CourseCode;

public class Customer {

	@NotNull(message="Please enter your full name")
	@Size(min=1, message="Please enter your full")
	private String custName;
	
	@NotNull(message="Please enter email ID")
	@Size(min=1, message="Please enter email ID")
	private String custEmail;
	private String jobType;
	private Integer ph;
	
	@NotNull(message="Password length must be of minimum 8 and maximum 20")
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$", message="Password should conatain at least one uppercase letter, one lowercase letter, one number")
	private String password;

	@CourseCode
	private String code;
	
	public Customer() {
		
	}
	
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public Integer getPh() {
		return ph;
	}

	public void setPh(Integer ph) {
		this.ph = ph;
	}

	public String getPassword() {
		
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
}
