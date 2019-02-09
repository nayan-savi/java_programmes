package com.coursemanagementsystem.dateformater;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

@Component
public class DateFormatGenerator {
	LocalDate date = new LocalDate();
	
	public String getDate(){
		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MM-yyyy");
        return dtf.parseLocalDate(date.toString("dd-MM-yyyy")).toString();
	}
}
