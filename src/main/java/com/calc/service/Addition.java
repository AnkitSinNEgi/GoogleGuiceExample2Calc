package com.calc.service;

public class Addition implements Calculation{

	@Override
	public double calculation() {
		double number1 = 7;
		double number2 = 11;
		double sum;		
		sum = number1 + number2;		
		System.out.println("Sum Of Two Number is " + sum);
		return sum;
	}
	

}
