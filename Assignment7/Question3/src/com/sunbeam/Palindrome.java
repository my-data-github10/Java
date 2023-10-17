package com.sunbeam;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str;
		String strRev;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String to check: ");
		str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		strRev = sb.toString();
		System.out.println(str);
		System.out.println(strRev);

		if (str.equals(strRev))
			System.out.println("String is a Palindrome");
		else
			System.out.println("String is not a palindrome");
	}

}