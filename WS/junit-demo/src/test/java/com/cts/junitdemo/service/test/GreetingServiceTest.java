package com.cts.junitdemo.service.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.cts.junitdemo.service.GreetingService;

public class GreetingServiceTest {
	
	@Test
	void testGreet() {
		//test data
		String userName = "Vamsy";
		//expected output
		String expected = "Hello Vamsy!";
		//actual output
		String actual = (new GreetingService()).greet(userName);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testGreetAsPerTime() {
		String userName="Vamsy";
		
		int hour = LocalDateTime.now().getHour();
		String greeting= "";
		
		if(hour>=3 && hour<=11) greeting="Good Morning";
		else if(hour>=12 && hour<=17) greeting="Good Noon";
		else greeting="Good Evening";
		
		String expected = greeting + " " + userName + "!";
		String actual = (new GreetingService()).greetAsPerTime(userName);
		assertEquals(expected, actual);
	}
}
