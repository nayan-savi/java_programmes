package com.coursemanagementsystem.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.coursemanagementsystem.dao.RegistrationDAO;
import com.coursemanagementsystem.exception.InvalidInputFault;
import com.coursemanagementsystem.exception.NoCourseFault;
import com.coursemanagementsystem.model.Courses;
import com.coursemanagementsystem.model.RegistrationRequest;

@Component
public class ValidateRequest {

	@Autowired
	private RegistrationDAO registrationDAO;

	public void validateRequest(RegistrationRequest registrationRequest) throws InvalidInputFault {
		if (StringUtils.isEmpty(registrationRequest.getFirstName())) {
			throw new InvalidInputFault("FirstName is empty");
		} else if (StringUtils.isEmpty(registrationRequest.getLastName())) {
			throw new InvalidInputFault("Lastname is empty");
		}else if(StringUtils.isEmpty(registrationRequest.getEmail())){
			throw new InvalidInputFault("Email is empty");
		}else if(StringUtils.isEmpty(registrationRequest.getDateOfBirth())){
			throw new InvalidInputFault("Date of birth is empty");
		}else if(StringUtils.isEmpty(registrationRequest.getPhoneNo())){
			throw new InvalidInputFault("Phone No. is empty");
		}else if(StringUtils.isEmpty(registrationRequest.getPassword())){
			throw new InvalidInputFault("Password is empty");
		}
	}

	public void validateCourse(int i) throws NoCourseFault {
		registrationDAO.fetchCourse(i);
	}

	public void validateCourse(Courses courses) throws InvalidInputFault{
		if (StringUtils.isEmpty(courses.getId())) {
			throw new InvalidInputFault("Id is empty");
		} else if (StringUtils.isEmpty(courses.getName())) {
			throw new InvalidInputFault("Name is empty");
		}else if(StringUtils.isEmpty(courses.getCost())){
			throw new InvalidInputFault("Cost is empty");
		}
	}

	public void validateId(String studentId) throws InvalidInputFault {
		if (StringUtils.isEmpty(studentId)) {
			throw new InvalidInputFault("studentId is empty");
		} 
		
	}

}
