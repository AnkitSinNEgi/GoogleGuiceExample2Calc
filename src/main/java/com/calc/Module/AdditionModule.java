package com.calc.Module;

import com.calc.service.Addition;
import com.calc.service.Calculation;
import com.google.inject.AbstractModule;

public class AdditionModule extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(Calculation.class).to(Addition.class);
	}

}
