package com.learncode.demospring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-xml.xml");
		Car carA = context.getBean("carA",Car.class); //by default @Component will create bean id as the name of a class in camelCase.
		carA.getPrice();
		context.close();

	}

}
