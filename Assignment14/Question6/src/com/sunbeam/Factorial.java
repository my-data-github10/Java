package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		//Scanner sc= new Scanner (System.in);
		//System.out.println(" Enetr the no for factorail");
		int num=6;
		Stream<Integer> strm = Stream.iterate(1, x -> x + 1)
				.limit(num);
		Integer fact = strm.reduce(1, (a,e) -> a * e);
		System.out.println("factorial : " + fact);
		
	}

}
