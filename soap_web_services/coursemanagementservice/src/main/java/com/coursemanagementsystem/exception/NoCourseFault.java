package com.coursemanagementsystem.exception;

public class NoCourseFault extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public NoCourseFault(String msg) {
		super(msg);
	}
}
