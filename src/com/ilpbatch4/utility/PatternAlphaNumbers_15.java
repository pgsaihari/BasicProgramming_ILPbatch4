package com.ilpbatch4.utility;

public class PatternAlphaNumbers_15 {

	public static void main(String[] args) {
		int input = 4;
		printNumberAlpha(input);

	}

	private static void printNumberAlpha(int input) {
		// TODO Auto-generated method stub

		for (int i = 0; i < input; i++) {
			char alpha = 'A';
			int number = 1;

			for (int j = 0; j < input - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(alpha + " ");
				alpha = (char) (alpha + 1);
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}

}
