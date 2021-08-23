package com.operators;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		String j=(i%2==0)?"even":"odd";
		System.out.println(j);

	}

}
