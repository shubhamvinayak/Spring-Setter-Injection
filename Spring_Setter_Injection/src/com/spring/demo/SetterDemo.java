package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {
	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		ReactJsCourse theCourse=context.getBean("reactJsCourse",ReactJsCourse.class);
		
		//call methods on the bean
		System.out.println(theCourse.getCourseDetails());
		System.out.println(theCourse.getDailyFortune());
		
		//load method form string literals
		System.out.println(theCourse.getEmailAddress());
		System.out.println(theCourse.getTeam());
		
		//close context
		context.close();
	}

}
