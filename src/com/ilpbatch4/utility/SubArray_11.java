package com.ilpbatch4.utility;

public class SubArray_11 {

	public static void main(String[] args) {
		int input = 100;
		subArray(input);
	}

	private static void subArray(int input) {
		int arr[] = { 4, 1, 2, 3, 5, 5, 7, 9, 12 };
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			for (int j = i + 1; j <= arr.length; j++) {
				if (sum == input) {
					System.out.println("Subarray between " + i + " and " + (j - 1));
					flag=true;
				}
				if (sum > input || j == arr.length) {
					break;
				}
				sum += arr[j];
			}
		}
		if(!flag)
			System.out.println("No subarray found with sum equal to " + input+" in the given array");
	}
}
