package com.sunbeam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Test3 {

	public static void main(String[] args) {
		Set <Book3> set = new TreeSet<> ();

		set.add(new Book3 ("A12",123,"Jack",2));
		set.add(new Book3 ("B22",450,"Mac",6));
		set.add(new Book3 ("C33",650,"ABC",9));
		set.add(new Book3 ("D44",700,"Xyz",3));
		set.add(new Book3 ("C33",700,"Xyz",3));
		set.add(new Book3 ("",800,"jjz",6));
		set.add(new Book3 ("",700,"Xyz",3));
		//set.add(new Book3 (null,700,"Xyz",3));	
		
		Iterator<Book3> itr3=set.iterator();
		while(itr3.hasNext())
		{
			Book3 b=itr3.next();
			System.out.println(" Book List" +b);
		}
	}

}
