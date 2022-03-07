package com.calc.service;

public class Substraction implements Calculation{

	@Override
	public double calculation() {
		double number1 = 7;
		double number2 = 5;
		double difference;
		
		difference=  number1 - number2;
		System.out.println("Difference Of number Is "+difference );
		return difference;
	}

}
