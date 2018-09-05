package com.yatharth.SpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements coach {

	@Override
	public String getDailyWorkout() {
		return "Run 3kms daily!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
           
}
