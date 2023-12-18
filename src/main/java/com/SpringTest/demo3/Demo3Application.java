package com.SpringTest.demo3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo3Application implements  CommandLineRunner  {
	
	public static final Logger logger = LoggerFactory.getLogger(Demo3Application.class);

	public static void main(String[] args) {
		
		logger.info("CI/CD first comment");
		SpringApplication.run(Demo3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("CI/CD second comment");
		// TODO Auto-generated method stub
		
	}

}
