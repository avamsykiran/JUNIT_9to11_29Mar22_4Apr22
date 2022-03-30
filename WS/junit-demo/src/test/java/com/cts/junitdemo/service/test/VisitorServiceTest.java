package com.cts.junitdemo.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cts.junitdemo.model.Gender;
import com.cts.junitdemo.model.Visitor;
import com.cts.junitdemo.service.VisitorService;

@DisplayName("VisitorService")
public class VisitorServiceTest {

	VisitorService visitorService;
	
	@BeforeEach
	void beforeStatringEachTestCase() {
		this.visitorService=new VisitorService();
	}
	
	@AfterEach
	void afterExecutingEachTestCase() {
		this.visitorService=null;
	}
	
	@Test
	@DisplayName("#createVisitor")
	void testCreateVisitor() {
		//Test Data
		String title="Mr.";
		String fullName="Vamsy";
		Gender gender = Gender.GENT;
		LocalDate dateOfBirth = LocalDate.now().minusYears(20);
		//Expected
		Visitor expected = new Visitor(title, fullName, dateOfBirth, 20, gender);
		//Actual
		Visitor actual = visitorService.createVisitor(title, fullName, gender, dateOfBirth);
		assertEquals(expected, actual);
	}
}
