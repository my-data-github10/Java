package com.sunbeam;
import java.util.*;
//import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.ListIterator;

public class TestBook {
	public static int menu() {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order using random access.");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Reverse the list ");
		System.out.println("Enter the choice :");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}
	
	
	public static void main(String[] args) {
		int choice;
		List<Book> list = new ArrayList<>();
		Book b;
		ListIterator<Book> itr;

		int index,qty;
		while ((choice = menu())!=0) {
			
			switch (choice) {
			case 1:
				b = new Book();
				b.accept();
				String key = b.getIsbn();
				if(list.contains(b)) {
					index = list.indexOf(b);
					Book b1 = list.get(index);
					b1.setQuantity(b1.getQuantity()+b.getQuantity());
					}
				else {
					list.add(b);
					System.out.println("Successfully added ....");
				}
				break;
			case 2:
				System.out.println("Forward display: ");
				for (int i = 0; i < list.size(); i++) {
					b = list.get(i);
					System.out.println(b);
				}
				break;
			case 3:{
				System.out.println("Enter the isbn which book you have to search :");
				b = new Book();
				String isbn = new Scanner(System.in).next();
				b.setIsbn(isbn);
				index = list.indexOf(b);
				if(index == -1)
					System.out.println("Book is not found :");
				else {
					System.out.println("your book is :");
					b = list.get(index);
					System.out.println(b);
				}
			}
				break;
			case 4:
				System.out.println("Enter the index to delete from list :");
				index = new Scanner(System.in).nextInt();
				if(index>=list.size())
					System.out.println("please Enter valid Index...");
				else
					list.remove(index);
				break;
			case 5:{
				System.out.println("Enter the isbn which book you have to Delete :");
				String isbn = new Scanner(System.in).next();
				b = new Book();
				b.setIsbn(isbn);
				index = list.indexOf(b);
				if(index == -1)
					System.out.println("Book is not found :");
				else {
					list.remove(index);
					System.out.println("Successfully deleted....");
				}
			}
				break;
			case 6:
				System.out.println("Reverse List :");
				Collections.reverse(list);
				System.out.println(list);
				
				
				break;
			default:
				System.out.println("Please Enter Valid Choice...");
				break;
			}	
		}	
	}
}