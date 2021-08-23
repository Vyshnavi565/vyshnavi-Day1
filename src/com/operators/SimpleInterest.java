package com.operators;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("First Input");
		int p=sc.nextInt();
		System.out.println("Second Input");
		int t=sc.nextInt();
		System.out.println("Third Input");
		float r=sc.nextFloat();
		float si=(p*t*r)/100;
		System.out.printf("%.2f",si);

	}

}
