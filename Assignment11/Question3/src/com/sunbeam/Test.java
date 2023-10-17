package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		Student[] arr = new Student[5];

		arr[0] = new Student(10, "Ashish", "Mumbai", 80);
		arr[1] = new Student(22, "Abhishekh", "Akola", 79.7);
		arr[2] = new Student(13, "Naveen", "Bijapur", 90);
		arr[3] = new Student(9, "ABC", "Nagpur", 85);
		arr[4] = new Student(10, "ABC", "pune", 80);

		System.out.println("Before Sort: ");
		for (Student s : arr)
			System.out.println(s);

		// sort by roll -- Comparable
		Arrays.sort(arr);

		System.out.println("After Sort by Student: ");
		for (Student s : arr)
			System.out.println(s);

		class StdCityDescComparator implements Comparator<Student> {
			@Override
			public int compare(Student s1, Student s2) {
				int diff = -(s1.getCity().compareTo(s2.getCity()));
				if (diff==0)
					diff=-Double.compare(s1.getMarks(),s2.getMarks());
				if (diff==0)
					diff= s1.getName().compareTo(s2.getName());	
				return diff;
			}
		}
		System.out.println("using Comparator");
		StdCityDescComparator std = new StdCityDescComparator();
		Arrays.sort(arr,std);
		for (Student student : arr) {
			System.out.println(student);
		}
		

	}

}
