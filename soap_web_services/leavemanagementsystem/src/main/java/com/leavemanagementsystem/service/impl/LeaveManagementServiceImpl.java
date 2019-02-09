package com.leavemanagementsystem.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StringUtils;

import com.leavemanagementsystem.model.LoginResponse;
import com.leavemanagementsystem.service.LeaveManagementService;

@WebService(targetNamespace = "http://impl.service.leavemanagementsystem.com/", portName = "LeaveManagementServiceImplPort", serviceName = "LeaveManagementServiceImplService")
public class LeaveManagementServiceImpl implements LeaveManagementService {
	@Autowired
	private LoginResponse loginResponse;

	@WebMethod(operationName = "generateStudentId", action = "urn:GenerateStudentId")
	@Override
	public String generateStudentId(@WebParam(name = "batchNo") String batchNo) {
		System.out.println("Object creation --------->" + loginResponse);
		StringBuffer stringBuffer = null;
		if (StringUtils.isEmpty(batchNo)) {
			System.out.println("Exception");
		} else {
			stringBuffer = new StringBuffer();
			stringBuffer.append(batchNo);
			stringBuffer.append("001");
		}
		return stringBuffer.toString();
	}

	@WebMethod(operationName = "generateStudentId", action = "urn:GenerateStudentId")
	@Override
	public String getName(@WebParam(name = "name") String name) {
		System.out.println("Object creation --------->" + loginResponse );
		loginResponse.setLoginStatus("SUCCESS");
		System.out.println("Object creation --------->" + loginResponse.getLoginStatus());
		return "Nayan";
	}

}
