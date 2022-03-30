package com.cts.junitdemo.service;

import java.time.LocalDate;
import java.time.Period;

import com.cts.junitdemo.model.Gender;
import com.cts.junitdemo.model.Visitor;

public class VisitorService {
	
	public boolean isValidTitle(String title) {
		//title can not be null and title must be any of 'Master.',"Baby.","Mr.","Mrs.","Ms.","Miss."
		return false;
	}
	
	public boolean isValidFullName(String fullName) {
		//must not be null and must be of atleast 5 chars to atmax of 50 chars in length
		//can not start with a number or space
		//no special chars except space, numbers and alphas are allowed
		return false;
	}
	
	public boolean isValidGender(Gender gender) {
		//can not be null
		return false;
	}
	
	public boolean isValidDateOfBirth(LocalDate dateOfBirth) {
		//can not be a future date or null
		return false;
	}

	public Visitor createVisitor(String title,String fullName,Gender gender,LocalDate dateOfBirth) {
		int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
		return new Visitor(title, fullName, dateOfBirth, age, gender);
	}
}
