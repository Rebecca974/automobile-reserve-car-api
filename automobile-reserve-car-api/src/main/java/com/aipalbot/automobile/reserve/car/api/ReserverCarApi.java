package com.aipalbot.automobile.reserve.car.api;

import com.aipalbot.automobile.models.lambda.LambdaRequest;
import com.aipalbot.automobile.models.lambda.LambdaResponse;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ReserverCarApi implements RequestHandler<LambdaRequest,LambdaResponse> {

	@Override
	public LambdaResponse handleRequest(LambdaRequest input, Context context) {
		LambdaResponse response = new LambdaResponse();
		response.setBody("From my lambda code, I received automobileName:" + input.getCarName());
		response.setStatusCode(200);
		
		return response;
	}

}
