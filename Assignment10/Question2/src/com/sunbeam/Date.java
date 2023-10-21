package com.sunbeam;

import java.util.Scanner;

public class Date implements Displayable{

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date() {
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public void accept() {
		System.out.println("**************************************");
		System.out.print("Enter day: ");
		this.day = new Scanner(System.in).nextInt();
		System.out.print("Enter month: ");
		this.month = new Scanner(System.in).nextInt();
		System.out.print("Enter year: ");
		this.month = new Scanner(System.in).nextInt();
		
	}

	@Override
	public void show() {
		System.out.println("**************************************");
		System.out.print(day + "/" + month + "/" + year);
		
	}
	
	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}

}