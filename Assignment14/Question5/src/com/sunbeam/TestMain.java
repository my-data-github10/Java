package com.sunbeam;

import java.util.Scanner;

@FunctionalInterface

interface check<T>{
	boolean compare(T x, T y);
}
public class TestMain {
	public static <T> int countIf(T[] arr, T key,check<T> c) {
		int count=0;
		for (T ele: arr) {
			if(c.compare(ele, key))
				count++;
		}
		return count;
	}
	public static void main(String [] args) {
		//Integer [] arr = {44, 77, 99, 22, 55, 66};
		//Integer key = 50;
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the key");
		Double key=sc.nextDouble();
		
		//Double key= 3.6;
		Double[] arr1= {1.1,2.4,3.6,4.8,1.2,3.6};
		
	int cnt = countIf(arr1, key, (x,y)-> x.equals(y) );
	System.out.println("Count = " + cnt);
	}
}























