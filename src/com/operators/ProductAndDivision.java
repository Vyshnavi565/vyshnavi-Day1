package com.operators;
import java.util.Scanner;
public class ProductAndDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("First Input: ");
		int i=sc.nextInt();
		System.out.println("Second Input: ");
		int j=sc.nextInt();
		int k=i*j;
		int l=i/j;
		int m=i%j;
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);

	}

}
