package com.sunbeam;

public class TestCirle {

	public static void main(String[] args) 
	{
		Circle circle=new Circle();
		circle.accept();
		double cir=circle.getDiameter();
		try
		{
			if(cir<0)
			{
				throw new ExceptionNegativeVal("Diameter cant be negative");
			}
		}
		catch(ExceptionNegativeVal e)
		{
			e.displayException();
		}
	}

}