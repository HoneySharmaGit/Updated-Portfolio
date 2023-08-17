package com.portfolio.entity;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateGenerator {

	public String getCurrentTime() {
		DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
		LocalDateTime now = LocalDateTime.now();
		String date = datetimeformatter.format(now);
		return date;
	}
}
