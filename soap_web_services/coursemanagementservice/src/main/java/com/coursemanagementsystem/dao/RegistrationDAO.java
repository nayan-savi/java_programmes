package com.coursemanagementsystem.dao;

import javax.sql.DataSource;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.coursemanagementsystem.dateformater.DateFormatGenerator;
import com.coursemanagementsystem.exception.DuplicateEntryFault;
import com.coursemanagementsystem.exception.NoCourseFault;
import com.coursemanagementsystem.model.CourseRequest;
import com.coursemanagementsystem.model.Courses;
import com.coursemanagementsystem.model.RegistrationRequest;

@Component
public class RegistrationDAO implements ICourseOperations {
	private static final String SQL = "insert into student (firstName, lastName, email, dateOfBirth, phoneNo, password, createdOn) values (?,?,?,?,?,?,?)";
	private static final String SQL_COURSE = "insert into courseregistration (studentid,firstName, lastName, email, coursename,batchnum, amount, status, createdOn) values (?,?,?,?,?,?,?,?,?)";
	private static final String SQL_SELECT = "select count(*) from courseregistration where batchnum = ?";
	private static final String SQL_STU_ID = "select max(studentid) from courseregistration where batchnum = ?";
	private static final int BATCH_SIZE = 200;
	private static final Object CREATE = "CREATE";
	private static final Object UPDATE = "UPDATE";
	private static final String SQL_COURSES = "insert into courses(id,name, cost, createdOn) values (?,?,?,?)";
	private static final String SQL_UPDATE_COURSE = "update courses set coursename = ?, cost= ?, updatedon = ? where id = ?";
	private static final String SQL_APPROVE_COURSE = "update courseregistration set status = ? , updatedon = ? where studentid = ?";
	private static final String SQL_LOGIN = "insert into login(username, pwd, status, type) values(?,?,?, ?)";
	private DataSource dataSource;
	@Autowired
	private DateFormatGenerator dateFormatGenerator;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplate = jdbcTemplateObject;
	}

	@Override
	public int create(RegistrationRequest regReq) {
		Object[] params = new Object[] { regReq.getFirstName(), regReq.getLastName(), regReq.getEmail(),
				regReq.getDateOfBirth(), regReq.getPhoneNo(), regReq.getPassword(), dateFormatGenerator.getDate() };
		int i = jdbcTemplate.update(SQL, params);
		if (i == 1) {
			Object[] paramsLogin = new Object[] { regReq.getEmail(), regReq.getPassword(), "A", "S" };
			i = jdbcTemplate.update(SQL_LOGIN, paramsLogin);
		}
		return i;
	}

	@Override
	public int fetchCourse(int batchNum) throws NoCourseFault {
		int batch = jdbcTemplate.queryForObject(SQL_SELECT, new Object[] { batchNum }, Integer.class);
		// int batch = 1;
		if (batch > BATCH_SIZE) {
			throw new NoCourseFault(
					"No seates are available in this batch " + batchNum + ", please try with another batch.");
		}
		return batch;
	}

	@Override
	public int createCourseRequest(CourseRequest courseRequest) throws DuplicateEntryFault {
		courseRequest.setStudentId(generateStudentId(courseRequest.getBatchNum()));
		Object[] params = new Object[] { courseRequest.getStudentId(), courseRequest.getFirstName(),
				courseRequest.getLastName(), courseRequest.getEmail(), courseRequest.getCourseName(),
				courseRequest.getBatchNum(), courseRequest.getAmount(), "P", dateFormatGenerator.getDate() };
		int row = 0;
		try {
			row = jdbcTemplate.update(SQL_COURSE, params);
		} catch (Exception e) {
			throw new DuplicateEntryFault("Record already Exists." + e);
		}
		return row;
	}

	private String generateStudentId(int num) {
		String name = jdbcTemplate.queryForObject(SQL_STU_ID, new Object[] { num }, String.class);
		String stuId = null;
		LocalDate date = new LocalDate();
		if (StringUtils.isEmpty(name)) {
			stuId = "B" + num + date.getDayOfYear() + date.getDayOfMonth() + "001";
		} else {
			String id[] = name.split("B");
			stuId = "B" + (Integer.parseInt(id[1]) + 1);
		}
		return stuId;
	}

	public int addOrUpdateCourse(Courses courses) throws DuplicateEntryFault {
		int row = 0;
		if (courses.getAction().equals(CREATE)) {
			Object[] params = new Object[] { courses.getId(), courses.getName(), courses.getCost(),
					dateFormatGenerator.getDate() };
			try {
				row = jdbcTemplate.update(SQL_COURSES, params);
			} catch (Exception e) {
				throw new DuplicateEntryFault("Record already Exists." + e);
			}
		} else if (courses.getAction().equals(UPDATE)) {
			row = jdbcTemplate.update(SQL_UPDATE_COURSE, new Object[] { courses.getName(), courses.getCost(),
					dateFormatGenerator.getDate(), courses.getId() });
		}
		return row;
	}

	public int approveCourse(String studentId, String status) {
		int row = 0;
		row = jdbcTemplate.update(SQL_APPROVE_COURSE,
				new Object[] { status, dateFormatGenerator.getDate(), studentId });
		return row;
	}

}
