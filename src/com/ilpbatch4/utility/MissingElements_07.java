package com.ilpbatch4.utility;

public class MissingElements_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 7, 9 };
		int limit = 10;
		missingElements(arr, limit);

	}
//
	public static void missingElements(int arr[], int limit) {
		System.out.println("Missing elements within the limit of " + limit);
		for (int i = 1; i <= limit; i++) {
			boolean found = false;
			for (int j = 0; j <= arr.length - 1; j++) {
				if (i == arr[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.print(i + " ");
			}

		}
	}

}
