package com.learning.core.day3session1;

import java.util.ArrayList;
import java.util.Scanner;

public class D03P7_1 {
    
	public static void main(String[] args) {
        
        ArrayList<String> studentNames = new ArrayList<>();

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the list of student names (separated by spaces):");
        String inputNames = scanner.nextLine();

        
        String[] namesArray = inputNames.split(" ");

        
        for (String name : namesArray) {
            studentNames.add(name);
        }

        
        System.out.println("Enter the name to search for:");
        String nameToFind = scanner.nextLine();

        
        boolean found = studentNames.contains(nameToFind);

        
        if (found) {
            System.out.println("Output: Found");
        } else {
            System.out.println("Output: Not Found");
        }

      
        scanner.close();
    }
}