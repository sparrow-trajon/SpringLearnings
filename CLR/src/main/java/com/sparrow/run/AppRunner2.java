package com.sparrow.run;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppRunner2 {
	
	@Bean
	public CommandLineRunner executeRunner() {
		
		return (x)->{
			System.out.println("command line runner executed using lambda expression");
		};
	}
}
