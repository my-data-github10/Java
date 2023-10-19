package com.sunbeam;

import java.util.Objects;

public class Book2 {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book2() {
		
	}

	public Book2(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int hashCode() {
		int hash = Objects.hash(this.isbn);
		return hash;
	
	}
	@Override
	public String toString() {
		return "Book2 [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Book2) {
			Book2 other = (Book2) obj;
			if(this.isbn == other.isbn)
				return true;
		}
		return false;	
		
	}
}
	


