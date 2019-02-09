package com.coursemanagementsystem.exception;

public class InvalidInputFault extends RuntimeException {
	private static final long serialVersionUID = 8842862104165459832L;

	public InvalidInputFault(String msg) {
		super(msg);
	}
}
