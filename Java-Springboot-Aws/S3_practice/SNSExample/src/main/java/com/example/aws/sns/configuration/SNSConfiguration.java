package com.example.aws.sns.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;

@Configuration
public class SNSConfiguration {

	@Value("${accessKey}")
	private String accessKey;
	@Value("${secretKey}")
	private String secretKey;

	public AWSCredentials credentials() {
		AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
		return credentials;
	}

	@Bean
	public AmazonSNS amazonSNS() {
		AmazonSNS sns = AmazonSNSClientBuilder.standard()
				.withCredentials(new AWSStaticCredentialsProvider(credentials())).withRegion(Regions.AP_SOUTH_1)
				.build();
		return sns;
	}
}
