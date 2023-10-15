package com.sunbeam.salary_distribution;
import java.util.Scanner;
public abstract class Employee {
	private String firstName;
	private String lastName;
	private int ssn;

	public Employee() {
		firstName = "";
		lastName = "";
		ssn = 0;
	}

	public Employee(String firstName, String lastName, int ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public void acceptData(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter first name = ");
		firstName = sc.nextLine();
		System.out.println("Enter last name = ");
		lastName = sc.nextLine();
		System.out.println("Enter ssn = ");
		ssn = sc.nextInt();
	}

	abstract public double calculateSal();

	@Override
	public String toString() {
		return "Employee [ firstName = " + firstName + ", lastName = " + lastName + ", ssn = " + ssn + " ]";
	}
	 
	public int menu(Scanner sc) {
		int choice;
		System.out.println("-----------------------------");
		System.out.println("0.Exit");
		System.out.println("1.Weekly salary of salaried employee");
		System.out.println("2.Hourly employee salary");
		System.out.println("3.Commision employee salary");
		System.out.println("4.Base plus commision employee salary");
		
		System.out.println("Enter your choice = ");
		choice= sc.nextInt();
		System.out.println("------------------------------");
		return choice;
	}

}
