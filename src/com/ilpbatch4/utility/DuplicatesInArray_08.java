package com.ilpbatch4.utility;

public class DuplicatesInArray_08 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1 };
		findDuplicates(arr);
	}

	public static void findDuplicates(int[] arr) {
		System.out.println("Duplicates in the array:");

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
