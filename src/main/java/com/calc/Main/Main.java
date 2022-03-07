package com.calc.Main;

import java.util.Scanner;

import com.calc.Module.AdditionModule;
import com.calc.Module.SubtractionModule;
import com.calc.Request.Request;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in); 
		    System.out.println("Enter Your Choice: \n 1 for Addition \n 2 for Substraction ");

		    int input = sc.nextInt(); 
		    System.out.println("You selected " + input); 
		    
		    Injector injector = null;
		    Request request = null;
		
		if (input==1) {
			injector = Guice.createInjector(new AdditionModule());
			request = injector.getInstance(Request.class);
		}
		else if (input==2)
		{
			injector = Guice.createInjector(new SubtractionModule());
			request = injector.getInstance(Request.class);
		}
		request.makeRequest();
	}

}
