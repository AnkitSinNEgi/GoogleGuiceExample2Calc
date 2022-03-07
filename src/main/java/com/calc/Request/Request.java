package com.calc.Request;

import com.calc.service.Calculation;
import com.google.inject.Inject;

public class Request {
	
	private Calculation calculation;
	
	@Inject
	public Request(Calculation calculation) {
		this.calculation = calculation;
	}
	
	public double makeRequest() {
		return calculation.calculation();
		
		
	}

}
