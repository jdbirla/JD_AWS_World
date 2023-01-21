package com.lambda.layer.user;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;

public class LambdaHandler implements RequestHandler<Map<String, String>, String> {

	public String handleRequest(Map<String, String> map, Context context) {
		Gson gson = new Gson();
		return "Lambda function invoked with the help of layer";
	}

}
