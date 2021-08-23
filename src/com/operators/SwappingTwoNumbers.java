package com.operators;
import java.util.Scanner;
public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("First Input: ");
		int i=sc.nextInt();
		System.out.println("Second Input: ");
		int j=sc.nextInt();
		int k=i;
		i=j;
		j=k;
		System.out.println(i);
		System.out.println(j);

	}

}
