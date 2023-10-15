package com.sunbeam.salary_distribution;
import java.util.Scanner;
public class CommisionEmployee extends Employee{
	protected double grossSales;
	protected double commisionRate;
	
	public CommisionEmployee() {
		grossSales = 0.0;
		commisionRate = 0.0;
	}
	
	public CommisionEmployee(double grossSales, double commisionRate) {
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter commision rate = ");
		this.commisionRate = sc.nextDouble();
		System.out.println("Enter gross sales = ");
		this.grossSales = sc.nextDouble();
	}

	@Override
	public double calculateSal() {
		double commEmpSal = (this.commisionRate*this.grossSales);
		return commEmpSal;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCommisionEmployee [gross sales = " + this.grossSales + ", commision rate = " + this.commisionRate+ "]";
//		return super.toString();
	}
	
	
	
	
}
