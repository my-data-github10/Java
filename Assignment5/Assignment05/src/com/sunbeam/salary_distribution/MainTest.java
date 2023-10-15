package com.sunbeam.salary_distribution;
import java.util.Scanner;
public class MainTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Employee emp = new Employee;
		Employee emp1 = new SalariedEmployee();
		Employee emp2 = new HourlyEmployee();
		Employee emp3 = new CommisionEmployee();
		CommisionEmployee ce1 = new BasePlusCommisionEmployee();
		int choice;
		while((choice= emp1.menu(scanner))!=0) {
			switch(choice) {
			case 1:
				emp1.acceptData(scanner);
				System.out.println(emp1);
				break;
				
			case 2:
				emp2.acceptData(scanner);
				System.out.println(emp2 + ",HourlyEmployee [ hourly employee salary = " + emp2.calculateSal() + " ]");
				break;
				
			case 3:
				emp3.acceptData(scanner);
				System.out.println(emp3 + ", [ "+"Commision employee salary ="+emp3.calculateSal()+" ]");
				break;
				
			case 4:
				ce1.acceptData(scanner);
				System.out.println(ce1 +", [Base plus commision employee salary = "+ ce1.calculateSal() + "]");
				break;
			}
		}	

	}

}
