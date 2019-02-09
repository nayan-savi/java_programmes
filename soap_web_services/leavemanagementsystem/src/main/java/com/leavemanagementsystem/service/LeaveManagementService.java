package com.leavemanagementsystem.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface LeaveManagementService {
	@WebMethod
	String generateStudentId(String batchNo);
	@WebMethod
	String getName(String name);

}
