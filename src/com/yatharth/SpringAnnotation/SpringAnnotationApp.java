package com.yatharth.SpringAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationApp {

	public static void main(String[] args) {
	   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	   coach thecoach = context.getBean("pubgCoach",PubgCoach.class);
	   System.out.println(thecoach.getDailyWorkout());
	   System.out.println(thecoach.getDailyFortune());
	   
	   context.close();

	}

}
