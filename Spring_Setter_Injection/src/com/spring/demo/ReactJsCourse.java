package com.spring.demo;

public class ReactJsCourse implements Course {
	
	private FortuneServices fortuneServices;
	
	//injecting literals
	//creating email and team
	private String EmailAddress;
	private String Team;
	
	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside set Email address");
		EmailAddress = emailAddress;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		System.out.println("Inside Set Team");
		Team = team;
	}

	//creating no-arg constructor
	public ReactJsCourse() {

	}

	public void setFortuneServices(FortuneServices fortuneServices) {
		System.out.println("Inside the fortune services");
		this.fortuneServices = fortuneServices;
	}

	@Override
	public String getCourseDetails() {
		return "Mastering ERactJs course";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServices.getFortune();
	}

}
