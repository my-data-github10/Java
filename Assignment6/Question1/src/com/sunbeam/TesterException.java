package com.sunbeam;

import java.util.Scanner;

public class TesterException {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your string:");
		String str=sc.nextLine();
		try
		{
		int strLength=str.length();
		if(strLength>80)
		{
			throw new ExceptionLineTooLong("Input string is too long!!!!!");
		}
		}
		catch(ExceptionLineTooLong e)
		{
			//e.displayException();
			e.printStackTrace();
		}
		System.out.println("Your string:"+str);
	}

}