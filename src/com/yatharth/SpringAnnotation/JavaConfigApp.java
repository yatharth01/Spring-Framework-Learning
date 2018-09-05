package com.yatharth.SpringAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {

	public static void main(String[] args) {
	   AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
	   coach thecoach = context.getBean("swimCoach",SwimCoach.class);
	  System.out.println(thecoach.getDailyWorkout());
	  System.out.println(thecoach.getDailyFortune());
	   
	   context.close();

	}

}
