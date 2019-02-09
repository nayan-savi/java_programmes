package com.coursemanagementsystem.dao;

import com.coursemanagementsystem.exception.DuplicateEntryFault;
import com.coursemanagementsystem.exception.NoCourseFault;
import com.coursemanagementsystem.model.CourseRequest;
import com.coursemanagementsystem.model.Courses;
import com.coursemanagementsystem.model.RegistrationRequest;

public interface ICourseOperations {
	public int create(RegistrationRequest registrationRequest);
	public int fetchCourse(int batchNum) throws NoCourseFault;
	public int createCourseRequest(CourseRequest courseRequest) throws DuplicateEntryFault;
	public int addOrUpdateCourse(Courses courses) throws DuplicateEntryFault;
	public int approveCourse(String studentId, String status);
	
}
