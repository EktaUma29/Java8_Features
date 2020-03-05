package com.spring.demo.one;

//Setter method
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getAllDailyWorkout() {
		// TODO Auto-generated method stub
		return "CricketCoach.getAllDailyWorkout(): Practice fast bowling for 3hrs.";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "CricketCoach.getAllDailyWorkout(): " + fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
