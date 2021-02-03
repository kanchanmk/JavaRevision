package com.javapractice;

import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		int input = 0;
		String userContinue = "y";
		
		while(userContinue.equals("y") ) {
			System.out.println("Enter a number berween 1 and 100 :");
			if(inputScanner.hasNext()) {
				input = inputScanner.nextInt();
				
				if(input %2 !=0)
				{
					if(input > 60) {
						
						System.out.println(input + " Odd and over 60");
					}else {
						System.out.println(input + " Odd");
					}
					
				}else {
					if(input <25) {
						System.out.println(" Even and less than 25");
					}else if(input < 60) {
						System.out.println(" Even");
					}else if(input > 60){
						System.out.println(input + " Even");
					}
				}
			}
			
			System.out.println("\ncontinue?(y/n)");
			if(inputScanner.next().contentEquals("y")) {
				userContinue = "y";
			}
			else {
				userContinue = "n";
				System.out.println("\nBye");
				inputScanner.close();
				
			}
		
		}

	}

}
