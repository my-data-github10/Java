package com.sunbeam;

import java.util.Scanner;

public class Person implements Displayable{
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept() {
		System.out.println("**************************************");
		System.out.println("Enter name: ");
		this.name = new Scanner(System.in).next();
		
	}

	@Override
	public void show() {
		System.out.println("**************************************");
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nAge is: " + age;
	}

}