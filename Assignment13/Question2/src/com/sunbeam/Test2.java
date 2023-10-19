package com.sunbeam;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Set <Book2> set= new LinkedHashSet<> ();
		
		set.add(new Book2 ("A12",123,"Jack",2));
		set.add(new Book2 ("B22",450,"Mac",6));
		set.add(new Book2 ("C33",650,"ABC",9));
		set.add(new Book2 ("D44",700,"Xyz",3));
		set.add(new Book2 ("C33",700,"Xyz",3));
		set.add(new Book2 ("",700,"Xyz",3));
		set.add(new Book2 ("",700,"Xyz",3));
		
		
		Iterator<Book2> itr2=set.iterator();
		while(itr2.hasNext())
		{
			Book2 b=itr2.next();
			System.out.println(" Book List" +b);
		}
	}  // if hash code method is not return then duplicate values and null is allowed 
}//in Linked hash Set data is sorted is as per insertion order
