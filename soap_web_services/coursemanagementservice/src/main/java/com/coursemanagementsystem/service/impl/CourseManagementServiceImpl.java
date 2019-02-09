package com.coursemanagementsystem.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.coursemanagementsystem.exception.CourseManagementException;
import com.coursemanagementsystem.exception.InvalidInputFault;
import com.coursemanagementsystem.exception.NoCourseFault;
import com.coursemanagementsystem.generate.model.IdCardResponse;
import com.coursemanagementsystem.model.CourseRequest;
import com.coursemanagementsystem.model.CourseResponse;
import com.coursemanagementsystem.model.Courses;
import com.coursemanagementsystem.model.LoginRequest;
import com.coursemanagementsystem.model.LoginResponse;
import com.coursemanagementsystem.model.RegistrationRequest;
import com.coursemanagementsystem.service.CourseManagementService;
import com.coursemanagementsystem.utility.WebServiceUtility;
import com.coursemanagementsystem.validation.ValidateRequest;

@WebService(targetNamespace = "http://impl.service.coursemanagementsystem.com/", portName = "CourseManagementServiceImplPort", serviceName = "CourseManagementServiceImplService")
public class CourseManagementServiceImpl implements CourseManagementService {
	@Autowired
	private WebServiceUtility webServiceUtility;
	@Autowired
	private ValidateRequest validateRequest;

	@WebMethod(operationName = "registerStudent", action = "urn:RegisterStudent")
	@Override
	public CourseResponse registerStudent(
			@WebParam(name = "registrationRequest") RegistrationRequest registrationRequest) throws InvalidInputFault {
		validateRequest.validateRequest(registrationRequest);
		return webServiceUtility.registerStudent(registrationRequest);
	}

	@WebMethod(operationName = "requestCourse", action = "urn:RequestCourse")
	@Override
	public CourseResponse requestCourse(@WebParam(name = "courseRequest") CourseRequest courseRequest)
			throws NoCourseFault {
		validateRequest.validateCourse(courseRequest.getBatchNum());
		return webServiceUtility.registerCourse(courseRequest);
	}

	@WebMethod(operationName = "studentLogin", action = "urn:StudentLogin")
	@Override
	public LoginResponse studentLogin(@WebParam(name = "loginRequest") LoginRequest loginRequest)
			throws CourseManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@WebMethod(operationName = "generateIdCard", action = "urn:GenerateIdCard")
	@Override
	public IdCardResponse generateIdCard(@WebParam(name = "studentId") String studentId)
			throws CourseManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@WebMethod(operationName = "addOrUpdateCourse", action = "urn:AddOrUpdateCourse")
	@Override
	public CourseResponse addOrUpdateCourse(@WebParam(name = "courses") Courses courses) {
		validateRequest.validateCourse(courses);
		return webServiceUtility.addOrUpdateCourse(courses);
	}

	@WebMethod(operationName = "courseApproval", action = "urn:CourseApproval")
	@Override
	public CourseResponse courseApproval(@WebParam(name = "studentId") String studentId,
			@WebParam(name = "status") String status) {
		validateRequest.validateId(studentId);
		return webServiceUtility.approveCourse(studentId, status);
	}

}
