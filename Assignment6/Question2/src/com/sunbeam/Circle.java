package com.sunbeam;

import java.lang.Math;
import java.util.Scanner;

public class Circle 
{
	private double diameter;
	Point2D point;
	Scanner sc =new Scanner(System.in);
	public Circle()
	{
	  this.diameter=100;	
	}
	public Circle(double diameter) 
	{
		this.diameter = diameter;
		point.setX(0);
		point.setY(0);
	}
    
	public double getDiameter() 
	{
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public void accept()
	{
	 System.out.println("Enter diameter:");
	 this.diameter=sc.nextDouble();
	}
}