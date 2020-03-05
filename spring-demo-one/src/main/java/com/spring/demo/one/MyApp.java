package com.spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import static java.lang.System.out;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("MyCoach", Coach.class);

		out.println(coach.getAllDailyWorkout());

		out.println(coach.getDailyFortune());

		CricketCoach cricketCoach = context.getBean("CricketCoach", CricketCoach.class);

		out.println(cricketCoach.getAllDailyWorkout());

		out.println(cricketCoach.getDailyFortune());

		out.println("Email Address: " + cricketCoach.getEmailAddress());
		out.println("Team Name: " + cricketCoach.getTeam());

		// For Random

		GolfCoach golfCoach = context.getBean("golfCoach", GolfCoach.class);
		out.println(golfCoach.getDailyFortune());

		context.close();
	}

}
