package com.ilpbatch4.utility;

public class AnchorPattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 3;
		printPatternAnchor(input);
	}

	public static void printPatternAnchor(int input) {

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input - i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			for (int k = 0; k <= i; k++) {
				if(k!=1) {
					System.out.print(k + " ");
				}
				
			}
			System.out.println("");
		}
		for (int i = input - 1; i >= 1; i--) {
			for (int j = input - i; j >= 1; j--) {
				System.out.print("  ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			for (int k = 0; k <= i; k++) {
				if(k!=1) {
					System.out.print(k + " ");
				}
				
			}
			System.out.println("");
		}
	}

}
