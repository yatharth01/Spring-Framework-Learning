package com.yatharth.SpringAnnotation;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class RandomFortuneService implements FortuneService {
    
	@Value("${foo.fortunes}")
	private String[] fortunes;
    
	@Override
	public String getDailyFortune() {
		Random r = new Random();
		int index = r.nextInt(3);
		
		return fortunes[index];
	}
	
	
	
	

}
