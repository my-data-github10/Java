package com.sunbeaminfo.creditlimitcalculator.calculator;
import java.util.Scanner;
public class CreditCalculator {
	
		private int account_no = 0;
		private int balance = 100000;
		private int charges;
		private int credits_paid;
		private int credit_limit = 150000;

		public CreditCalculator() {
			this(0, 100000, 100000, 90000, 150000);
		}

		public CreditCalculator(int account_no, int balance, int charges, int credits_paid, int credit_limit) {
			this.account_no = account_no;
			this.balance = balance;
			this.charges = charges;
			this.credits_paid = credits_paid;
			this.credit_limit = credit_limit;
		}

		public void acceptData() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Details: ");
			System.out.print("Enter Account No.: \t");
			this.account_no = sc.nextInt();
			System.out.print("Enter Balance: \t");
			this.balance = sc.nextInt();
			System.out.print("Enter Charges: \t");
			this.charges = sc.nextInt();
			System.out.print("Enter Credits Paid: \t");
			this.credits_paid = sc.nextInt();
		}

		public void calculate() {
			int newBalance = this.balance + this.charges - this.credits_paid;
			if(this.credit_limit>newBalance)
				System.out.println("Within Limit");
			else
				System.out.println("Credit limit exceeded");
		}
	}