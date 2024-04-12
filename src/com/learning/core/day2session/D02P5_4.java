package com.learning.core.day2session;

import java.util.Scanner;

public class D02P5_4 {
	public static int minDeletionsToPalindrome(String str) {
        int n = str.length();
        
        int[][] dp = new int[n][n];
        
        for (int l = 2; l <= n; l++) {
            for (int i = 0; i < n - l + 1; i++) {
                int j = i + l - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[0][n - 1];
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in) ;
			String input =sc.next();
			System.out.println("Input: " + input);
			int minDeletions = minDeletionsToPalindrome(input);
			System.out.println("Output: " + minDeletions);
			
			sc.close();
			
		}
    }


