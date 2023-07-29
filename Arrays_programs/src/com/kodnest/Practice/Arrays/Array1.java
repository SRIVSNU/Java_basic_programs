package com.kodnest.Practice.Arrays;

import java.util.Scanner;

public class Array1 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter array size");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter array elements");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("array elements are");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	scan.close();
}
}
