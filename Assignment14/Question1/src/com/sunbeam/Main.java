package com.sunbeam;

public class Main {
	public static void main(String [] args) {
		Employee []arr= new Employee[3];
		arr[0]= new Clerk(10000);
		arr[1]= new Manager(100,20000);
		arr[2]= new  Labor(400,100);
		
		double Total=Employee.calcTotalIncome(arr);
		System.out.println("Total Income =" +Total);
		
	}

}
