package com.ilpbatch4.utility;

public class SumOfPairs_10 {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 8, 1 };
        int key = 5;
        pairsArray(arr, key);
    }

    public static void pairsArray(int arr[], int key) {
    	int total=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == key) {
                	total+=1;
                    System.out.println("Pairs: (" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
        System.out.println("Total pairs: "+total);
    }
}
