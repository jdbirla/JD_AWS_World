package com.aws.lambda;

import java.time.LocalDateTime;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Map<String, String>, String> {

	public String handleRequest(Map<String, String> input, Context context) {

		System.out.println("sysout Input is:" + input);
		LambdaLogger logger = context.getLogger();
		logger.log("log date is:"+LocalDateTime.now());
		return "current date time:" + LocalDateTime.now();
	}

}
