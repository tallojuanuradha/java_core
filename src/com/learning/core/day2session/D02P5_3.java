package com.learning.core.day2session;


public class D02P5_3 {
	public static void printSubsequences(String str) {
        int n = str.length();
        
        for (int len = 1; len <= n; len++) {
     
            for (int start = 0; start <= n - len; start++) {
                
                System.out.println(str.substring(start, start + len));
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Input: " + str);
        System.out.println("Output:");
        printSubsequences(str);
    }

}
