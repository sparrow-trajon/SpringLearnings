package com.sparrow;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClrApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ClrApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	
System.out.println("Runner");		
	}

}
