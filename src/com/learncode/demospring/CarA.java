package com.learncode.demospring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Annotation to tell that this class is a bean
@Component
@Scope("singleton")
public class CarA implements Car {

//Annotation for Autowiring	
@Autowired
@Qualifier("engineForCarA")
private Engine engine;  

private String carName;

//Setting value to this property
@Value("HTK+")
private String modelNumber;

@Value("5L")
private String cost;

	//Annotation for Init Method
	@PostConstruct
	public void init() {
		System.out.println("Intializing..");
		this.carName = "A";
	}

	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		System.out.println("Car "+carName);
		System.out.println("Model Number "+modelNumber);
		System.out.println("Engine "+engine.display());
		System.out.println("Base Model Cost "+cost);
	}
	
	//Annotation for Destroy Method
	@PreDestroy
	public void destroy() {
		System.out.println("Thanks..");
	}

}
