package com.yatharth.SpringAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PubgCoach implements coach {
    
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	PubgCoach(){
		System.out.println("Inside default constructor");
		
	}
	//public FortuneService getFortuneService() {
		///return fortuneService;
	//}

	
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

	//@Autowired
	//PubgCoach(FortuneService fortuneService)
	//{
	//	this.fortuneService=fortuneService;
	//}
	
	@Override
	public String getDailyWorkout() {
		return "Kill atleast 15 , and do chicken dinner!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	@PostConstruct
	public void Onstartup() {
		System.out.println("this is it");
	}
	
	@PreDestroy
	public void OncleanUp() {
		System.out.println("cleared");
	}

}
