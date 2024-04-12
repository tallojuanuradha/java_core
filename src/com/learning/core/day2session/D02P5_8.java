package com.learning.core.day2session;

import java.util.Scanner;

public class D02P5_8 {
	public static boolean canSplitIntoFour(String s) {
        if (s.length() < 4) {
            return false;
        }

        for (int i = 1; i < s.length() - 2; i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                for (int k = j + 1; k < s.length(); k++) {
                    String first = s.substring(0, i);
                    String second = s.substring(i, j);
                    String third = s.substring(j, k);
                    String fourth = s.substring(k);
                    if (!first.equals(second) && !first.equals(third) && !first.equals(fourth) &&
                        !second.equals(third) && !second.equals(fourth) && !third.equals(fourth)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
			String input = sc.next();
			if (canSplitIntoFour(input)) {
			    System.out.println("Yes");
			} else {
			    System.out.println("No");
			    
			    sc.close();
			}
		}
    }


