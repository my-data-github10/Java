package com.appinfo.invoice;
import java.util.Scanner;

public class Invoice {
	String partNumber;
	String partDesc;
	int quantity;
	double price;
	Scanner sc = new Scanner(System.in);

	public Invoice() {
		partNumber = "F1";
		partDesc = "Engine";
		quantity = 1;
		price = 1000;
	}

	public Invoice(String partNumber, String partDesc, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDesc = partDesc;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public void accept() {
		System.out.println("Enter the Part Number : ");
		partNumber = sc.next();
		System.out.println("Enter the Part Description : ");
		partDesc = sc.next();
		System.out.println("Enter the quantity : ");
		quantity = sc.nextInt();
		if (quantity < 0)
			quantity = 0;
		System.out.println("Enter the price : ");
		price = sc.nextInt();
	}

	public void display() {
		System.out.println("Part Number : " + partNumber);
		System.out.println("Part Description : " + partDesc);
		System.out.println("Quantity : " + quantity);
		System.out.println("Price : " + price);
	}

	public void calInvoice() {
		System.out.println("Total price = " + quantity * price);
	}
}