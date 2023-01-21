package com.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.event.S3EventNotification.S3EventNotificationRecord;

public class S3EventHandler implements RequestHandler<S3Event, String> {

	@Override
	public String handleRequest(S3Event event, Context context) {
		S3EventNotificationRecord record = event.getRecords().get(0);
		System.out.println("Bucket name is:" + record.getS3().getBucket().getName());
		String fileName = record.getS3().getObject().getKey();
		if (fileName.contains("success")) {
			System.out.println("Inside success case");
			return "Your event is triggered check lambda function logs for more detail";
		} else {
			System.out.println("Inside failure case");
			throw new RuntimeException("Throwing exception to check failure case");
		}

	}
}
