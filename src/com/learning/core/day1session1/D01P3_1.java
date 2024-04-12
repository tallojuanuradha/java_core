package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P3_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number between 1 to 12: ");
			int monthNumber = scanner.nextInt();

			String[] months = {"January", "February", "March", "April", "May", "June",
			                   "July", "August", "September", "October", "November", "December"};

			if (monthNumber >= 1 && monthNumber <= 12) {
			    String monthName = months[monthNumber - 1];
			    System.out.println("Month name: " + monthName);
			} else {
			    System.out.println("Invalid input. Please enter a number between 1 to 12.");
			}
		}
    }
}