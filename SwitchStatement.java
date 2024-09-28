package com.bptn.course;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("enter a number (1-7) : ");
		int day  = scanner.nextInt();
		
		//switch case
		
		switch(day) {
		// fall through
		case 1: System.out.println("today is Sunday");
			break;
		case 2: System.out.println("today is Moday");
		break;
		case 3:System.out.println("today is Tuesday");
		break;
		
		case 4:System.out.println("today is Wednesday");
		break;
		
		case 5:System.out.println("today is Thursday");
		break;
		
		case 6:System.out.println("today is Friday");
		break;
		
		case 7:System.out.println("today is Saturday");
		
		default: System.out.println("Invalid number");
		}
	}
}
