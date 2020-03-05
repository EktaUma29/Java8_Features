package com.spring.demo.one;

public class BaseBallCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
		
	}

	public String getAllDailyWorkout() {
		return "BaseBallCoach.getAllDailyWorkout(): Spent 2 hours in BaseBall";
	}

	public String getDailyFortune() {
		
		return "BaseBallCoach.BaseBallCoach(): " + fortuneService.getFortune();
	}
}
