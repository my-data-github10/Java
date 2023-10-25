package com.sunbeam;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



import java.util.ArrayList;
import java.util.Arrays;

public class TesterBook {

	public static void main(String[] args) {
		int choice;
		List<Book> list = new ArrayList<>();

		
		while ((choice = menu())!=0) {
			
			switch (choice) {
			case 1:
				Book b=new Book();
				b.accept();
				list.add(b);
				break;
			case 2:
				for (Book book : list) {
					System.out.println(book);
				}
				break;
			case 3:
				System.out.println("Enter the index to delete from list :");
				int index = new Scanner(System.in).nextInt();
				if(index>=list.size())
					System.out.println("please Enter valid Index...");
				else
					list.remove(index);
				break;
			case 4:
				System.out.println("Enter isbn to check:");
				String isbn = new Scanner(System.in).next();
				Book key = new Book();
				key.setIsbn(isbn);
				if(list.contains(key)) {
					System.out.println("Book is Found!!!");}
				else {
					System.out.println("Book is not Found");}
				break;
			case 5:
				list.clear();
				break;
			case 6:
				System.out.println("Number of books ="+list.size());
				break;
			case 7:
				class BookPriceComparator implements Comparator<Book>{
					@Override
					public int compare(Book b1, Book b2) {
						int diff = - Double.compare(b1.getPrice(), b2.getPrice());
						return diff;
					}
				}
				BookPriceComparator sc = new BookPriceComparator();
				list.sort(sc);
				System.out.println("Sorted books: ");
				for (Book li : list) {
					System.out.println(li);
				}
				break;
			default:
				System.out.println("Please Enter Valid Choice...");
				break;
			}
			
		}
		
		
	}
	public static int menu() {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete at book given index");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order");
		System.out.println("Enter the choice :");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}
}
