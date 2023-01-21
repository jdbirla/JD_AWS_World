package com.example.aws.sns.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.PublishRequest;

@Service
public class SNSService {

	@Autowired
	private AmazonSNS sns;

	@Value("${topic.arn}")
	private String topicARN;

	/**
	 * Method that publish message SNS
	 * 
	 * @param message
	 * @param topicArn
	 */
	public void pubTopic(String subject, String message) {

		try {
			PublishRequest request = new PublishRequest(topicARN, message);
			request.setSubject(subject);
			sns.publish(request);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
