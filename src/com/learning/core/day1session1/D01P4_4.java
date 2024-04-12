package com.learning.core.day1session1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D01P4_4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 2;
        
        List<List<Integer>> result = findCombinations(arr, k);
        
        
        System.out.println("Distinct combinations of length " + k + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
    
    public static List<List<Integer>> findCombinations(int[] arr, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        Arrays.sort(arr); 
        
        generateCombinations(arr, k, 0, combination, result);
        
        return result;
    }
    
    private static void generateCombinations(int[] arr, int k, int start, List<Integer> combination, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        
        for (int i = start; i <= arr.length - k; i++) {
            combination.add(arr[i]);
            generateCombinations(arr, k - 1, i + 1, combination, result);
            combination.remove(combination.size() - 1);
        }
    }
}