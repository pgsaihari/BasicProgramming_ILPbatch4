package com.ilpbatch4.utility;

public class SumOfFactorials_06 {
	public static void main(String[] args) {
		int input = 3;
		
		sumofFactorial(input);
	}
	private static void sumofFactorial(int input) {
		float sum = 0;
		for (int i = 0; i <= input; i++) {
			sum = sum + ((float) i / factorial(i));
		}
		System.out.print(sum +"is the sum of given input according to the provided equation");

	}
	private static int factorial(int value) {
		int fact = 1;
		for (int i = 1; i <= value; i++) {
			fact = fact * i;
		}
		return (fact);
	}
}
