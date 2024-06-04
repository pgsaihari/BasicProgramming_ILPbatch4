package com.ilpbatch4.utility;

public class TrianglePattern{
    public static void main(String[] args) {
        int input=5;
        trianglePattern(input);
    }
    public static void trianglePattern(int input){
        for(int i=1;i<=input;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}