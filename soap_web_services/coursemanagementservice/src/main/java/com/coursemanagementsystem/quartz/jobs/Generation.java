package com.coursemanagementsystem.quartz.jobs;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class Generation extends QuartzJobBean {
	private static int count;

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		Date date = new Date();
		generateId(date, count);

	}

	private void generateId(Date date, int count) {
		System.out.println("B1" + date.getYear() + date.getMonth() + count++);
	}

}
