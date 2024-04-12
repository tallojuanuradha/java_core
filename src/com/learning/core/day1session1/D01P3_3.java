package com.learning.core.day1session1;


import java.util.Scanner;

public class D01P3_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the marks obtained by the student: ");
			int marks = scanner.nextInt();
			
			int percentage = (marks * 100) / 100; 
			
			String grade = calculateGrade(percentage);
			System.out.println("Grade: " + grade);
		}
    }
    
    public static String calculateGrade(int percentage) {
        if (percentage >= 60) {
            return "Grade A";
        } else if (percentage >= 45) {
            return "Grade B";
        } else if (percentage >= 35) {
            return "Grade C";
        } else {
            return "Fail";
        }
    }
}