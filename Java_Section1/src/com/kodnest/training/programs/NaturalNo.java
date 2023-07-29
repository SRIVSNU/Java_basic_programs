package com.kodnest.training.programs;

import java.util.Scanner;

public class NaturalNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n to print sum of n natural no ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
			sc.close();
		}
		System.out.println(sum);
	}

}
