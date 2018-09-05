package com.yatharth.SpringAnnotation;

public class SwimCoach implements coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService thefortuneservice)
	{
		fortuneService=thefortuneservice;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice butterfly";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
