package com.javapractice;

import java.util.Scanner;

public class lab2 {
	
	public static void main (String[] args) {
		
		Scanner sideScanner = new Scanner(System.in);
		double area  = 0; 
		double perimeter = 0;
		double side1 = 0;
		double side2 = 0;
		boolean shallContinue = true;
		
		
		
		System.out.println("Welcome to Grand Circus’ Room Detail Generator!");
		
		while(shallContinue) {
			
		
		
			System.out.println("Enter Length:");
			
			if(sideScanner.hasNext())
			{
				side1 = sideScanner.nextDouble();
				
			}
			System.out.println("You entered "+ side1);
			System.out.println("Enter Width:");
			
			
			if(sideScanner.hasNext())
			{
				side2  = sideScanner.nextDouble();
				
			}
			System.out.println("You entered "+ side2);
			area = side1* side2;
			perimeter = 2*(side1 + side2);
			
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			
			System.out.println("Continue? (y/n)");
			
			if(sideScanner.next().contentEquals("y")) {
				shallContinue =  true;
			}
			else {
				shallContinue = false;
			}
			
		}
		
		System.out.println("Thank you !!!");
		sideScanner.close();
		
	}

}
