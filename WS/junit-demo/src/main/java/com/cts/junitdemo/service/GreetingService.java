package com.cts.junitdemo.service;

import java.time.LocalDateTime;

public class GreetingService {

	public String greet(String userName) {
		return String.format("Hello %s!", userName);
	}
	
	public String getTimlyGreeting() {

		int hour = LocalDateTime.now().getHour();
		String greeting= "";
		
		if(hour>=3 && hour<=11) greeting="Good Morning";
		else if(hour>=12 && hour<=17) greeting="Good Noon";
		else greeting="Good Evening";
		
		return greeting;
	}
	
	public String greetAsPerTime(String userName) {
		return String.format("%s %s!", getTimlyGreeting(),userName);
	}
}