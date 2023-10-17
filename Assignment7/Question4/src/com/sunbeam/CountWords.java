package com.sunbeam;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string: ");
		str = sc.nextLine();
		String strArr[] = str.trim().split("\\s+");
		int totWords = strArr.length;
		System.out.println("Number of words are: " + totWords);
	}

}