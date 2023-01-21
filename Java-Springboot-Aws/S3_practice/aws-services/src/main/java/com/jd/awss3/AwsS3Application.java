package com.jd.awss3;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwsS3Application {

	public static void main(String[] args) {
		SpringApplication.run(AwsS3Application.class, args);
	}


}
