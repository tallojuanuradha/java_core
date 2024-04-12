package com.learning.core.day3session1;

import java.util.*;

class Car1 implements Comparable<Car> {
    private String name;
    private double price;

    public Car1(String name, double price) {
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
        Car car = (Car) obj;
        return Double.compare(car.getPrice(), price) == 0 &&
                Objects.equals(name, car.getName());
    }

    @Override
    public int compareTo(Car other) {
        // Compare based on price in reverse order
        return Double.compare(other.getPrice(), this.price);
    }
}

public class D03P8_6 {
    public static void main(String[] args) {
        // Creating TreeMap to store Car details
        TreeMap<Car, String> carMap = new TreeMap<>();

        // Adding predefined Car details
        carMap.put(new Car("Bugatti", 80050.0), "Bugatti");
        carMap.put(new Car("Swift", 305000.0), "Swift");
        carMap.put(new Car("Audi", 600100.0), "Audi");
        carMap.put(new Car("Benz", 900000.0), "Benz");

        // Retrieving the price of the car in reverse order
        for (Car car : carMap.keySet()) {
            System.out.println(car);
        }
    }
}