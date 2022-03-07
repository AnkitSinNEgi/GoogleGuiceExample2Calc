package com.calc.Module;


import com.calc.service.Calculation;
import com.calc.service.Substraction;
import com.google.inject.AbstractModule;
import com.calc.service.Substraction;

public class SubtractionModule extends AbstractModule{

	
	@Override
	protected void configure() {
		bind(Calculation.class).to(Substraction.class);
	}
}
