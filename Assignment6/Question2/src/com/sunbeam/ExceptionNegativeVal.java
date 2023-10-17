package com.sunbeam;

public class ExceptionNegativeVal extends RuntimeException {
private String exceptionMsg;
	
	public ExceptionNegativeVal() 
	{
		
	}

	public ExceptionNegativeVal(String exceptionMsg) 
	{	
		this.exceptionMsg = exceptionMsg;
	}
	public void displayException()
	{
		System.out.println(this.exceptionMsg);
	}

	@Override
	public String toString() {
		return "ExceptionNegativeVal= " + exceptionMsg;
	}

}