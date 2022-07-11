package com.sparrow.run;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Command implements CommandLineRunner{
	
	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println("Hey I am running");
	}
}
