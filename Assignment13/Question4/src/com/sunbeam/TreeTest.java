package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeTest {
	public static void main(String[] args) {
		class BookPriDescComparator implements Comparator<Book> {
			@Override
			public int compare(Book b1, Book b2) {
				int diff = -Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}

		}
		//BookPriDescComparator cmp =
		TreeSet<Book> set = new TreeSet<>( new BookPriDescComparator());

		set.add(new Book("A12", 123, "Jack", 2));
		set.add(new Book("B22", 450, "Mac", 6));
		set.add(new Book("C33", 650, "ABC", 9));
		set.add(new Book("D44", 700, "Xyz", 3));
		set.add(new Book("C33", 700, "Xyz", 3));
		set.add(new Book("", 800, "jjz", 6));
		set.add(new Book("", 700, "Xyz", 3));
		// set.add(new Book (null,700,"Xyz",3));

		System.out.println("Price in Descending order");
		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(" Book List" + b);
		}
//		
		System.out.println("Price In descending order");
		
		Iterator<Book> itr1 = set.descendingIterator();
		while (itr1.hasNext()) {
			Book book = (Book) itr1.next();
			System.out.println(book);
		}

	}

}
