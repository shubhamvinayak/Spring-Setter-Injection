package com.spring.demo;

public class JavaCourse implements Course{
	
	private FortuneServices fortuneService;
	
	public JavaCourse(FortuneServices fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getCourseDetails() {
		return "This course is estimated about 4 months";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
