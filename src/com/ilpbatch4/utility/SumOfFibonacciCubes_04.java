package com.ilpbatch4.utility;

public class SumOfFibonacciCubes_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 10;
		fibonacci(3);
	}

	public static void fibonacci(int input) {
		int num1=1;
		int num2=2;
		int sum = 5;
		if(input==1) {
			System.out.print("sum:1");
		}
		else if(input==2) {
			System.out.print("sum:"+sum);
		}
		else {
			for (int i = 3; i <= input; i++) {
				int num3=num1+num2;
				sum=sum+cube(num3);
				num2=num3;
				num1=num2;
			}
		}
		

		
		

		System.out.print("sum of the fibonacci series is:"+sum);
	}
	public static int cube(int num) {
		return num*num*num;
	}
	

}
