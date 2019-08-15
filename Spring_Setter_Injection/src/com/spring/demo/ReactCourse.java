package com.spring.demo;

public class ReactCourse implements Course{
	
	private FortuneServices fortuneServices;

	public ReactCourse(FortuneServices fortuneServices) {
		super();
		this.fortuneServices = fortuneServices;
	}

	@Override
	public String getCourseDetails() {
		// TODO Auto-generated method stub
		return "This course require 6months of training";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServices.getFortune();
	}

}
