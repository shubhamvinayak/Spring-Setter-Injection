package com.spring.demo;

public class HappyFortuneServices implements FortuneServices {

	@Override
	public String getFortune() {
		return "Today you will get 95% discount";
	}

}
