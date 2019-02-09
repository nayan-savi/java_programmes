package com.coursemanagementsystem.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class RegistrationResponse {
	private String status;
	private Date dateOfReg;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateOfReg() {
		return dateOfReg;
	}

	public void setDateOfReg(Date dateOfReg) {
		this.dateOfReg = dateOfReg;
	}

}
