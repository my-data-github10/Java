package com.sunbeam.salary_distribution;
import java.util.Scanner;
public class SalariedEmployee extends Employee {
	private double weeklySal;

	public SalariedEmployee() {
		weeklySal = 0.0;
	}

	public double getWeeklySal() {
		return weeklySal;
	}

	public void setWeeklySal(double weeklySal) {
		this.weeklySal = weeklySal;
	}

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter weekly salary = ");
		weeklySal = sc.nextDouble();
	}

	@Override
	public double calculateSal() {
		System.out.println("weekly salary = " + this.weeklySal);
		return weeklySal;
	}

	@Override
	public String toString() {

		// return super.toString();
		return "SalariedEmployee [ " + super.toString() + ", weekly salary = " + this.weeklySal
				+ " ] ";
	}

}
