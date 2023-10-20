package com.sunbeam;
import java.util.Scanner;

@ FunctionalInterface
interface Arithematic {
	double cal(double num1, double num2);
}

public class Calculate {
	static void calculate(double num1, double num2, Arithematic op) {
		double result = op.cal(num1, num2);
		System.out.println("Result: " + result);
		System.out.println();
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice;
		do {

			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			double num1, num2;
			System.out.println("Enter two numbers");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();

			switch (choice) {

			case 1:
				calculate(num1, num2, (x, y) -> x + y);
				break;

			case 2:

				calculate(num1, num2, (x, y) -> x - y);
				break;

			case 3:

				calculate(num1, num2, (x, y) -> x * y);
				break;

			case 4:
				
				calculate(num1, num2, (x, y) -> x / y);
				break;

			}

		} while (choice != 0);

	}
	
}