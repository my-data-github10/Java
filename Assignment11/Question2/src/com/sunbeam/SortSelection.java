package com.sunbeam;

import java.util.Comparator;

public class SortSelection {
	public static <T> void selectionSort(T[] arr, Comparator<T> c) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		class SortArray implements Comparator<Double> {
			@Override
			public int compare(Double arg0, Double arg1) {

				if (arg0.doubleValue() > arg1.doubleValue())
					return 1;
				return 0;
			}
		}

		SortArray comparator = new SortArray();
		Double[] arr = { 7.7, 9.3, 4.4, 1.9, 2.3 };
		for (Double double1 : arr) {
			System.out.println("before sort : " + double1);
		}

		selectionSort(arr, comparator);
		for (Double double1 : arr) {
			System.out.println("After sort : " + double1);
		}
	}
}