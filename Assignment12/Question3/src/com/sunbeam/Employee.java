package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	 int empid;
	String empName;
	double salary;
	
	public Employee() {
		//this(111, "abc", 10.11);
	}
	
	public Employee(int empid, String empName, double salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid;
	}
	
	public void accept() {
		System.out.println("Enter the Employee ID:");
		empid = new Scanner(System.in).nextInt();
		System.out.println("Enter the Employee Name:");
		empName = new Scanner(System.in).next();
		System.out.println("Enter the Employee Salary:");
		salary = new Scanner(System.in).nextDouble();
	}
}