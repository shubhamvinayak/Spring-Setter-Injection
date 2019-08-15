package com.spring.demo;

public class AndroidCourse implements Course {

	//define private field for dependency
	private FortuneServices fortuneService;
	
	public AndroidCourse() {
		
	}
	//define constructor for dependency injection
	public AndroidCourse(FortuneServices theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	
	@Override
	public String getCourseDetails() {
		// TODO Auto-generated method stub
		return "This course is estimated about 1 year";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
