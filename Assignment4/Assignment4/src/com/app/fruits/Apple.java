package com.app.fruits;

public class Apple extends Fruit {
	public Apple()
	{
		super("Apple");
		
	}
	
	public Apple(String colour, double weight, String name, boolean isFresh) {
		super(colour, weight, name, isFresh);
		
	}
	
	@Override
	public String taste() {		
		return "sweet n sour";
	}
}