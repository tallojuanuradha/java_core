package com.learning.core.day2session;

import java.util.Scanner;

public class D02P5_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

       
        System.out.print("Enter the number of vowels to count from the end: ");
        int n = scanner.nextInt();

        
        int count = countLastNVowels(inputString, n);

        
        if (count == -1) {
            System.out.println("Mismatch in Vowel Count.");
        } else {
            System.out.println("Last " + n + " vowels: " + getLastNVowels(inputString, n));
        }

        scanner.close();
    }

    
    public static int countLastNVowels(String str, int n) {
        int vowelCount = 0;
        int count = 0;

        
        for (int i = str.length() - 1; i >= 0 && count < n; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                count++;
            }
        }

        
        if (count < n) {
            return -1; 
        }

        return vowelCount;
    }
   
    public static String getLastNVowels(String str, int n) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        
        for (int i = str.length() - 1; i >= 0 && count < n; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.insert(0, ch);
                count++;
            }
        }

        return sb.toString();
    }
}