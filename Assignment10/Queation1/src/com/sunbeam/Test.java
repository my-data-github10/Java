package com.sunbeam;

import java.util.*;

class Box<T extends Employee>
   {
	private T obj;
	public void set (T val) {this.obj = val;}
	public T get() { return this.obj;}
	
	public double getTotalsalary() {
		return obj.calculateTotalSalary();
	     }
	}

public class Test {
	
	public static void main(String[] args)
	{
		Manager m = new Manager();
		m.acceptData();
		m.displayData();
		Box< Manager> b1 =new Box<>();
		b1.set(m);
		System.out.println("manager total salary ="+b1.getTotalsalary());
		
		
		Salesman s= new Salesman();
		s.acceptData();
		s.displayData();
		Box<Employee> b2 = new Box<>();
		b2.set(s);
		System.out.println("Salesman Total salary "+ b2.getTotalsalary());
		
	}
	

}