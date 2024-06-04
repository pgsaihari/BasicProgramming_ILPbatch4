package com.ilpbatch4.utility;

public class ZeroOneZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;
		
		
		printPatternZ(input);
	}

	public static void printPatternZ(int input) {
		for (int i = 1; i <= input; i++) {
			if (i == 1 || i == input) {
				for (int j = 1; j <= input; j++) {
					System.out.print(j%2!=0?"0":"1");
				}

			} else {
				for (int j = 1; j <= input - i; j++) {
					System.out.print(" ");
				}
				System.out.print(i%2!=0?"0":"1");
			}
			System.out.println("");

		}
	}

}
