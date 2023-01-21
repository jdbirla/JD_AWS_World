package com.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;
import com.amazonaws.services.lambda.runtime.events.SNSEvent.SNSRecord;

public class SNSEventHandler implements RequestHandler<SNSEvent, String> {

	@Override
	public String handleRequest(SNSEvent event, Context context) {
		SNSRecord snsRecord = event.getRecords().get(0);
		System.out.println("Subject:"+snsRecord.getSNS().getSubject());
		System.out.println("Message:"+snsRecord.getSNS().getMessage());
		return "Your SNS event is triggered, kindly check logs";
	}

}
