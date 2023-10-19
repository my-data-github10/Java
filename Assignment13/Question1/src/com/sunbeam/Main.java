package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Book> set= new HashSet<>();// duplicates are removed by equals
						// equal() and hashcode method
		
		set.add(new Book ("A12",123,"Jack",2));
		set.add(new Book ("B22",450,"Mac",6));
		set.add(new Book ("C33",650,"ABC",9));
		set.add(new Book ("D44",700,"Xyz",3));
		set.add(new Book ("C33",700,"Xyz",3));
		set.add(new Book ("",700,"Xyz",3));
		set.add(new Book ("",700,"Xyz",3));
		
		
		Iterator<Book> itr1=set.iterator();
		while(itr1.hasNext())
		{
			Book b=itr1.next();
			System.out.println(" Book List" +b);
		
		}

	}// only one null values allowed. Additional null values are not allowed.

}
