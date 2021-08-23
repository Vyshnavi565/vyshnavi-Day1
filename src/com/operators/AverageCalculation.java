package com.operators;
import java.util.*;
public class AverageCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("First Input: ");
		float i=sc.nextFloat();
		System.out.println("Second Input: ");
		float j=sc.nextFloat();
		System.out.println("Third Input: ");
		float k=sc.nextFloat();
		System.out.println("Fourth Input: ");
		float l=sc.nextFloat();
		System.out.println("Fifth Input: ");
		float m=sc.nextFloat();
		float n=(i+j+k+l+m)/5;
		System.out.printf("%.2f",n);
		

	}

}
