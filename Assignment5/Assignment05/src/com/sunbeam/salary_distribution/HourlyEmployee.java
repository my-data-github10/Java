package com.sunbeam.salary_distribution;
import java.util.Scanner;
public class HourlyEmployee extends Employee {
	private double hourlyWage;
	private double hours;

	public HourlyEmployee() {
		hourlyWage = 0.0;
		hours = 0.0;
	}

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter hourly wage = ");
		this.hourlyWage = sc.nextDouble();
		System.out.println("Enter work hours = ");
		this.hours = sc.nextDouble();
	}

	@Override
	public double calculateSal() {
		double hourlyEmpSal = 0;
		if (this.hours <= 40) {
			hourlyEmpSal = this.hourlyWage * this.hours;
		} else if (this.hours > 40) {
			hourlyEmpSal = (40 * this.hourlyWage + (this.hours - 40) * this.hourlyWage * 1.5);
		}
		return hourlyEmpSal;
	}

	@Override
	public String toString() {
		return super.toString() + "\nHourlyEmployee [hourlyWage=" + this.hourlyWage + ", hours=" + this.hours + "]";
	}
}
