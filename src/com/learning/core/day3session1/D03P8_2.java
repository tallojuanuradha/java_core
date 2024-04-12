package com.learning.core.day3session1;

import java.util.HashMap;

public class D03P8_2 {
    public static void main(String[] args) {
        // Create a HashMap to store phone book entries
        HashMap<String, String> phoneBook = new HashMap<>();

        // Predefined phone book details
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Emma", "7554432211");
        phoneBook.put("Michael", "7123345566");
        phoneBook.put("Sophia", "7332214455");
        phoneBook.put("William", "7998877766");

        // Perform search operation
        String searchName = "Joseph";
        String phoneNumber = phoneBook.get(searchName);

        // Output the result
        if (phoneNumber != null) {
            System.out.println("Phone number for " + searchName + ": " + phoneNumber);
        } else {
            System.out.println("No phone number found for " + searchName);
        }
    }
}