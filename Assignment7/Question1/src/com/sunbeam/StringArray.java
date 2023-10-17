package com.sunbeam;

public class StringArray {

	public static void main(String[] args) {
		String arr1[] = { "Java ", "CPP ", "DBT ", "Java ", "CPP ", "OS ", "CN ", "WebTech " };
		String arr2=new String();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					arr2+=arr1[i];
				}
			}
		}
		System.out.println("The duplicate values are: "+arr2);

	}

}