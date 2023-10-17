package com.app.fruits;

public class Orange extends Fruit{
	
	public Orange() {
		super("Orange");
	}

	public Orange(String colour, double weight, String name, boolean isFresh, boolean isFresh2) {
		super(colour, weight, name, isFresh);
		isFresh = isFresh2;
	}	
	
	@Override
	public String taste() {
		
		return "sour";
	}
}