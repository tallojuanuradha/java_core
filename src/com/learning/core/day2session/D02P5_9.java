package com.learning.core.day2session;

import java.util.Scanner;

public class D02P5_9 {
	public static String replaceSpaces(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String input =sc.nextLine();
        String replacedString = replaceSpaces(input);
        System.out.println("Original string: " + input);
        System.out.println("String with spaces replaced: " + replacedString);
        
        sc.close();
    }
	
}