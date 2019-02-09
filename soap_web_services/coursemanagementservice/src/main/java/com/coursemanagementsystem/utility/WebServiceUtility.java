package com.coursemanagementsystem.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coursemanagementsystem.dao.RegistrationDAO;
import com.coursemanagementsystem.model.CourseRequest;
import com.coursemanagementsystem.model.CourseResponse;
import com.coursemanagementsystem.model.Courses;
import com.coursemanagementsystem.model.RegistrationRequest;

@Component
public class WebServiceUtility {

	@Autowired
	private CourseResponse courseResponse;

	@Autowired
	private RegistrationDAO registrationDAO;

	public CourseResponse registerStudent(RegistrationRequest registrationRequest) {
		return statusReponse(registrationDAO.create(registrationRequest));
	}

	public CourseResponse registerCourse(CourseRequest courseRequest) {
		return statusReponse(registrationDAO.createCourseRequest(courseRequest));
	}

	public CourseResponse addOrUpdateCourse(Courses courses) {
		return statusReponse(registrationDAO.addOrUpdateCourse(courses));
	}

	public CourseResponse approveCourse(String studentId, String status) {
		return statusReponse(registrationDAO.approveCourse(studentId, status));
	}
	
	private CourseResponse statusReponse(int i){
		if (i > 0) {
			courseResponse.setStatus("SUCCESS");
		} else {
			courseResponse.setStatus("FAILURE");
		}
		return courseResponse;
	}
}
