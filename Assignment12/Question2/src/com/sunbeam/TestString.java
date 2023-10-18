package com.sunbeam;
import java.util.*;

public class TestString {
	public static void main(String[] args) {
			
			List<String> list = new ArrayList<>();
			list.add("Mumbai");
			list.add("Nagpur");
			list.add("pune ");
			list.add("Nasik");
			
			

			//local class
			class Max implements Comparator<String>{
			@Override
			public int compare(String s1, String s2) {
				return s1.length()-s2.length();
			}
			}
			Max m1 = new Max(); 
			System.out.println("high string :"+ Collections.max(list,m1));
//			System.out.println("high string :"+ Collections.max(list));
		}
	}