package com.learning.core.day3session1;

import java.util.*;

class car4 implements Comparable<car4> {
    private String name;
    private double price;

    public car4(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        car4 car4 = (car4) obj;
        return Double.compare(car4.price, price) == 0 &&
                Objects.equals(name, car4.name);
    }

    @Override
    public int compareTo(car4 other) {
        return Double.compare(this.price, other.price);
    }

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}

public class D03P8_8 {
    public static void main(String[] args) {
        // Creating TreeMap to store car4 details
        TreeMap<Double, car4> car4Map = new TreeMap<>();

        // Adding predefined car4 details
        car4Map.put(80050.0, new car4("Bugatti", 80050.0));
        car4Map.put(305000.0, new car4("Swift", 305000.0));
        car4Map.put(600100.0, new car4("Audi", 600100.0));
        car4Map.put(900000.0, new car4("Benz", 900000.0));

        // Remove and get a key-value mapping associated with the greatest key
        Map.Entry<Double, car4> greatestEntry = car4Map.lastEntry();
        System.out.println(greatestEntry.getValue());
        car4Map.remove(greatestEntry.getKey());

        // Replace the value mapped by the specified key with the new value
        double key = 80050.0;
        car4Map.replace(key, new car4("Reva", key));

        // Print the updated TreeMap
        for (car4 car4 : car4Map.values()) {
            System.out.println(car4);
        }
    }
}