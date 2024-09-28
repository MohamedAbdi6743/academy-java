package com.bptn.course;

import java.util.Scanner;
public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("welcome to the mobile data plan selector!");
			System.out.println("Enter the number corresponding to your choice");
			System.out.println("1. 1 GB - $10");
			System.out.println("2. 5 GB - $30");
			System.out.println("3. 10 GB - $50");
			System.out.println("4. Unlimited - $70");
			System.out.println("5. Exit");
			
			int choice = scanner.nextInt();
			
			
			switch(choice) {
				
			case 1: System.out.println("your total is $10")
				
			}
	}

}
