package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

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
		System.out.println("7. Save books in the file the file ");
		System.out.println("8. Load books in the the file ");
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
				
			case 7:
				try ( FileOutputStream fout=new FileOutputStream("Books.text")) {
					try(DataOutputStream dout= new DataOutputStream (fout)){
						for (Book bk :list) {
							
							dout.writeUTF(bk.getIsbn());
							dout.writeDouble(bk.getPrice());
							dout.writeUTF(bk.getAuthorName());
							dout.writeInt(bk.getQuantity());
					
						}
					}
					
				}
				catch  (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Books  Saved");
				break;
				
			case 8:
				try (FileInputStream fin= new FileInputStream("Books.text")){
					try(DataInputStream din= new DataInputStream (fin)){
						while(true) {
							Book bk= new Book();
						bk.setIsbn(din.readUTF());
						bk.setPrice(din.readDouble());
						bk.setAuthorName(din.readUTF());
						bk.setQuantity(din.readInt());
						System.out.println(bk);
						}
						
					}
					
				}
				catch (EOFException e) {
				
				}
				catch (Exception e ) {
					e.printStackTrace();
				}
				break ;
			default:
				System.out.println("Please Enter Valid Choice...");
				break;
			}	
		}	
	}

}
