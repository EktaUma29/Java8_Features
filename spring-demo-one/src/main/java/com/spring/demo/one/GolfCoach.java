package com.spring.demo.one;

public class GolfCoach implements Coach {

	private RandomFortuneService randomFortuneService;

	public GolfCoach(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	public String getAllDailyWorkout() {
		// TODO Auto-generated method stub
		return "GolfCoach.getAllDailyWorkout: ";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "GolfCoach.getDailyFortune: " + randomFortuneService.getFortune();
	}

}
