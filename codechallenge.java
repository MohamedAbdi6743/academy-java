package com.bptn.course;
import java.util.Scanner;
public class codechallenge {

	
	
	
	// read user input
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a string:"); 
	String input = scanner.nextLine();
	// declare storage variables
	
	int vowelCount = 0;
	int consonantCount = 0;
	
	
	// convert everything to lowercase
	
	String lowerCaseInput = input.toLowerCase();
	
	
	//loop through each character in the string
	for (int i=0; i<lowerCaseInput.length(); i++) {
		char ch = lowerCaseInput.charAt(i);
		
		
		
		
		
	}
	
	//check if its a vowel
	
	if (ch=='a' || ch =='e' || ch== 'i' || ch == 'o ' || ch == 'u') {
		
		
		vowelCount++;
	}
	// update the count
	else if (ch>='a' && ch <= 'z') {
		
		consonantCount++;
	}
	
	//print the count
	

}












package com.bptn.course.BigChallenges;

import java.util.*;

public class BigChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Loop to allow continuous operations
            System.out.println("/... Calculator Menu.../");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find the square root");
            System.out.println("Press 7 to find the reciprocal");
            System.out.println("Press 8 to exit");

            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("You selected addition. Enter the first number you'd like to add");
                double num1 = scanner.nextDouble();

                System.out.println("Enter the second number you'd like to add");
                double num2 = scanner.nextDouble();

                double sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

                System.out.println("To continue calculation, Press 1, else, press any other number to exit");
                int input2 = scanner.nextInt();
                if (input2 == 1) {
                    continue; // Restart the loop for a new operation
                } else {
                    break; // Exit the loop and the program
                }

            } else if (input == 2) {
                System.out.println("You selected subtraction. Enter the first number you'd like to subtract");
                double num1 = scanner.nextDouble();

                System.out.println("Enter the second number you'd like to subtract");
                double num2 = scanner.nextDouble();

                double difference = num1 - num2;
                System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);

            } else if (input == 3) {
                System.out.println("You selected multiplication. Enter the first number you'd like to multiply");
                double num1 = scanner.nextDouble();

                System.out.println("Enter the second number you'd like to multiply");
                double num2 = scanner.nextDouble();

                double product = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

            } else if (input == 4) {
                System.out.println("You selected division. Enter the first number you'd like to divide");
                double num1 = scanner.nextDouble();

                System.out.println("Enter the number you'd like to divide it by");
                double num2 = scanner.nextDouble();

                if (num2 != 0) {
                    double quotient = num1 / num2;
                    double remainder = num1 % num2;

                    System.out.println("Dividing " + num1 + " by " + num2 + ", the quotient is: " + quotient);
                    System.out.println("The remainder is: " + remainder);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }

            } else if (input == 5) {
                System.out.println("You selected to square a number. Enter the number you'd like to square");
                double num1 = scanner.nextDouble();

                double square = num1 * num1;
                System.out.println(num1 + " squared is: " + square);

            } else if (input == 6) {
                System.out.println("You selected to find a square root. Enter the number you'd like to find the square root of:");
                double num1 = scanner.nextDouble();

                if (num1 >= 0) {
                    double squareRoot = Math.sqrt(num1);
                    System.out.println("The square root of " + num1 + " is: " + squareRoot);
                } else {
                    System.out.println("Error: Cannot find the square root of a negative number.");
                }

            } else if (input == 7) {
                System.out.println("You selected to find the reciprocal. Enter the number you'd like to reciprocate");
                double num1 = scanner.nextDouble();

                if (num1 != 0) {
                    double reciprocal = 1 / num1;
                    System.out.println("The reciprocal of " + num1 + " is: " + reciprocal);
                } else {
                    System.out.println("Error: Reciprocal of zero is undefined.");
                }

            } else if (input == 8) {
                System.out.println("Exiting...");
                break; // Exit the loop and program
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        
       
        	
        	System.out.println("Invalid choice! Please use")
        	
        }
        scanner.close();
    }
}

