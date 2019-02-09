package com.coursemanagementsystem.model;

import org.springframework.stereotype.Component;

@Component
public class CourseResponse {
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
