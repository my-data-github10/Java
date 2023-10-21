package com.sunbeam;

import java.util.*;

public class Person {
	private int age;
	private String name;
	
	public void acceptData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter age - ");
		this.age = scanner.nextInt();
		
		System.out.print("Enter name- ");
		this.name = scanner.next();
	}
	
	
	
@Override
	public String toString() {
		return "Person [age =" + age + ", name=" + name + "]";
	}



public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}