package com.sunbeam;

import java.util.*;

public class Manager extends Employee {
	private int bonus;

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter bonus = ");
		this.bonus = new Scanner(System.in).nextInt();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Bonus = " + this.bonus);
	}
	
	
	
@Override
	public double calculateTotalSalary() {
	//System.out.println("Total Manager Salary - "+(this.basicSalary + this.bonus));
		return this.basicSalary + this.bonus;
	}

	
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + "]";
	}
		
}