package com.learning.core.day3session1;

import java.util.*;

public class D03P8_1 {
    public static void main(String[] args) {
        
        HashMap<String, String> phoneBook = new HashMap<>();

       
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Kathe", "7234560011");
        phoneBook.put("Smith", "8293893311");

      
        System.out.println("Phone Book details:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
