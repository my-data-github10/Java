package com.sunbeam.salary_distribution;
import java.util.Scanner;
public class BasePlusCommisionEmployee extends CommisionEmployee {
	private double baseSal;

	public BasePlusCommisionEmployee() {
		baseSal = 0.0;
	}

	public BasePlusCommisionEmployee(double grossSales, double commisionRate, double baseSal) {
		super(grossSales, commisionRate);
		this.baseSal = baseSal;
	}

	public double getBaseSal() {
		return baseSal;
	}

	public void setBaseSal(double baseSal) {
		this.baseSal = baseSal;
	}

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter base salary = ");
		baseSal = sc.nextDouble();
	}

	@Override
	public double calculateSal() {
//		super.calculateSal();
		this.baseSal += (commisionRate * grossSales);
		return baseSal;
	}

	@Override
	public String toString() {
		return  super.toString() + "\nBasePlusCommisionEmployee [base salary = " + this.baseSal + "]";
	}

}
