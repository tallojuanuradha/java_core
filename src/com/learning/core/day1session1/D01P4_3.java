package com.learning.core.day1session1;

import java.util.HashMap;

public class D01P4_3 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 4, 1, 2};
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                minIndex = Math.min(minIndex, map.get(arr[i]));
            } else {
                map.put(arr[i], i);
            }
        }
        
        
        if (minIndex == Integer.MAX_VALUE) {
            System.out.println("No repeating element found.");
        } else {
            System.out.println("Index of the first repeating element: " + minIndex);
        }
    }
}

