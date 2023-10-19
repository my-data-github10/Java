package com.sunbeam;
import java.util.Scanner;
	public class Book  {
		private String isbn;
		private double price;
		private String authorName;
		private int quantity;
		
		public Book() {
			
		}

		public Book(String isbn, double price, String authorName, int quantity) {
			super();
			this.isbn = isbn;
			this.price = price;
			this.authorName = authorName;
			this.quantity = quantity;
		}
		
		public void accept() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" Enter isbn");
			this.isbn=sc.next();
			System.out.println(" Enter price");
			this.price=sc.nextDouble();
			System.out.println(" Enter authorname");
			this.authorName=sc.next();
			System.out.println(" Enter quantity");
			this.quantity=sc.nextInt();
			
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

	//	@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
					+ "]";
		}
//		public boolean equals(Object obj) {
//			if (obj == null)
//				return false;
//			if (this == obj)
//				return true;
//			if (obj instanceof Book)
//			return true;
//		    return false;
//			
//		}
//		public int compareTo(Book other) {
//			int diff = this.isbn.compareTo(other.isbn);
//			
//			return diff;
//		}
//			
		}


