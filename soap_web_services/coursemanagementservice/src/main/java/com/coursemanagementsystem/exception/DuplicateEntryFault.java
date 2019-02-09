package com.coursemanagementsystem.exception;

public class DuplicateEntryFault extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DuplicateEntryFault(String msg) {
		super(msg);
	}

}
