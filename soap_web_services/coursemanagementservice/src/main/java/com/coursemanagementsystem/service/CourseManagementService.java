package com.coursemanagementsystem.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

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

/**
 * @author NAYAN
 *
 */

@WebService
public interface CourseManagementService {
	@WebMethod
	CourseResponse registerStudent(RegistrationRequest registrationRequest) throws InvalidInputFault;

	@WebMethod
	CourseResponse requestCourse(CourseRequest courseRequest) throws NoCourseFault;

	@WebMethod
	LoginResponse studentLogin(LoginRequest loginRequest) throws CourseManagementException;

	@WebMethod
	IdCardResponse generateIdCard(String studentId) throws CourseManagementException;

	@WebMethod
	CourseResponse addOrUpdateCourse(Courses courses);

	@WebMethod
	CourseResponse courseApproval(String studentId, String status);

}
