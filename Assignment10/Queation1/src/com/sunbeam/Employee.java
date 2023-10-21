package com.sunbeam;

import java.util.*;

abstract public class Employee extends Person {
	    private int empid;
		protected double basicSalary;

	abstract public double calculateTotalSalary();

	public void acceptData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter empid- ");
		this.empid = scanner.nextInt();
		System.out.print("Enter basic salary - ");
		this.basicSalary = scanner.nextDouble();
		
	}

	public void displayData() {
		System.out.println("Empid - "+this.empid);
		System.out.println("Basic Salary- "+this.basicSalary);

	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", basicSalary=" + basicSalary + "]";
	}		
}