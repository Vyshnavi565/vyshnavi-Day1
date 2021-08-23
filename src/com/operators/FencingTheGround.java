package com.operators;
import java.util.Scanner;
public class FencingTheGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		int perimeter=2*(length+breadth);
		int area=length*breadth;
		System.out.println(perimeter);
		System.out.println(area);

	}

}
