package com.operators;
import java.util.Scanner;
public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("First Input: ");
		int i=sc.nextInt();
		System.out.println("Second Input: ");
		int j=sc.nextInt();
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println(i);
		System.out.println(j);

	}

}
