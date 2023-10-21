package com.sunbeam;
import java.util.*;


public class Salesman extends Employee {

	
	private double commission;
	
	@Override
	public void acceptData() {
		Scanner scanner = new Scanner(System.in);
		super.acceptData();
		System.out.print("Enter the commission - ");
		this.commission = scanner.nextDouble();
		
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Commission - "+this.commission);
		
	}


	
	
	
	@Override
	public double calculateTotalSalary() {
		//System.out.println("Total Salesman Salary - "+(this.basicSalary + this.commission));
		return this.basicSalary + this.commission;
	}

	@Override
	public String toString() {
		return "Salesman [commission=" + commission + "]";
	}

	
}