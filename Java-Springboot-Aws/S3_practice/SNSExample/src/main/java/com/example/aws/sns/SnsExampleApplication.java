package com.example.aws.sns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnsExampleApplication {


	public static void main(String[] args) {
		SpringApplication.run(SnsExampleApplication.class, args);
		System.out.println("Inside main method");
	}

}
