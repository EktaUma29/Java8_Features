package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class TennisBallCoach implements Coach {

	public String getDailyWorkOut() {
		return "Spend 2 hours workout";
	}

}
