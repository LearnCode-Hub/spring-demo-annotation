package com.learncode.demospring;

import org.springframework.stereotype.Component;

@Component
public class EngineForCarB implements Engine {
private String engine = "1.4-litre Turbo GDI petrol engine";
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return engine;
	}

}
