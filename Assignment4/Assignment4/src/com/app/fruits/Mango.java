package com.app.fruits;

public class Mango extends Fruit{
	public Mango() {
		super("Mango");
	}

	public Mango(String colour, double weight, String name, boolean isFresh, boolean isFresh2) {
		super(colour, weight, name, isFresh);
		
	}
	
	@Override
	public String taste() {
		
		return "sweet";
	}
}