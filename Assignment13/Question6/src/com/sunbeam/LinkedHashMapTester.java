package com.sunbeam;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMapTester {
	
	public static int menu() {
		int choice;
		System.out.println("0. Exit ");
		System.out.println("1. Insert in map");
		System.out.println("2. find in map");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		LinkedHashMap<Integer,Student> lmap = new LinkedHashMap<>();
		
		int choice;
		
		while ((choice = menu())!=0 ) {
			
			switch (choice) {
			case 1:
				Student s = new Student();
				s.accept();
				lmap.put(s.getRoll(), s);
				break;
				
			case 2:
				System.out.println("Enter roll : ");
				int roll = new Scanner(System.in).nextInt();
				Student stu = lmap.get(roll);
				System.out.println(stu.toString()); 
				break;
				
			default:
				break;
			}
			
		}
		

	}
}


