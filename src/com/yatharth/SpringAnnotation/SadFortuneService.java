package com.yatharth.SpringAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class SadFortuneService implements FortuneService {
    
	@Value("${foo.temp}")
	public String myfortune;
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myfortune;
	}

}
