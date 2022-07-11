package com.sparrow.run;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppRunnerAnnonymous {
	
	@Bean
	public ApplicationRunner executeAppRunner() {
		 
		ApplicationRunner applicationRunner= new ApplicationRunner() {
			
			@Override
			public void run(ApplicationArguments args) throws Exception {
				
				System.out.println("Application runner executed using the anonymous inner class");
			}
		};
	return applicationRunner;
	}
}
