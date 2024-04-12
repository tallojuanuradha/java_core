package com.learning.core.day2session;

import java.util.Scanner;

public class D02P5_6 {
	public static int longestPrefixSuffix(String s) {
        int n = s.length();
        int maxLength = 0;
     
        for (int i = 0; i < n / 2; i++) {
            String prefix = s.substring(0, i + 1);
            String suffix = s.substring(n - i - 1);

            if (prefix.equals(suffix)) {
                maxLength = i + 1;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
			String str = sc.next();
			System.out.println("Output for \"" + str + "\": " + longestPrefixSuffix(str));
		
    sc.close();
    }

    }


