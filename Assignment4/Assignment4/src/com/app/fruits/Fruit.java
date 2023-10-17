package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String colour;
	private double weight;
	private String name;
	private boolean isFresh;
	
	
	public Fruit() {
		this("",0,"",true);
	}
	public Fruit(String name)
	{
		this.name=name;
		
	}
	
	public String getColour() {
		return this.colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	public Fruit(String colour, double weight, String name, boolean isFresh) {
		
		this.colour = colour;
		this.weight = weight;
		this.name = name;
		this.isFresh=isFresh;
		
	}
	
	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the colour  = ");
		this.colour=sc.next();
		System.out.print("Enter the weight  = ");
		this.weight=sc.nextDouble();
		System.out.println("Enter the Fruit is fresh or not (0)for false and (1) for true =");
		this.isFresh=sc.hasNextBoolean();
		
	}


  public void displayData()
  {
	  System.out.println("Name of the Fruit is = "+name);
	  System.out.println("Color is = "+colour);
	  System.out.println("Weight is = "+weight);
  }

	public String  taste()
	{
		return "no specific taste";
	}
}