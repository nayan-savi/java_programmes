package com.leavemanagementsystem.model;

import org.springframework.stereotype.Component;

@Component
public class LoginResponse {
	private String loginStatus;

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

}
