package com.sunbeam;

public class ExceptionLineTooLong extends RuntimeException
{
	private String exceptionMsg;
	
	public ExceptionLineTooLong() 
	{
		
	}

	public ExceptionLineTooLong(String exceptionMsg) 
	{	
		this.exceptionMsg = exceptionMsg;
	}
	public void displayException()
	{
		System.out.println(this.exceptionMsg);
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong= " + exceptionMsg;
	}
	

}