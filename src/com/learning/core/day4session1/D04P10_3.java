package com.learning.core.day4session1;

import java.util.Scanner;


public class D04P10_3 {
    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true; // Return true if found
            }
        }
        return false; // Return false if not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of arrays: ");
        int numArrays = scanner.nextInt();

        for (int i = 1; i <= numArrays; i++) {
            System.out.print("Enter the size of array " + i + ": ");
            int size = scanner.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter " + size + " integers for array " + i + ":");
            for (int j = 0; j < size; j++) {
                arr[j] = scanner.nextInt();
            }

            System.out.print("Enter the element to search in array " + i + ": ");
            int target = scanner.nextInt();

            if (linearSearch(arr, target)) {
                System.out.println("Element is Present");
            } else {
                System.out.println("Element is not Present");
            }
        }

        scanner.close();
    }
}