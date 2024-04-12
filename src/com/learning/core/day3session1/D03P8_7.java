package com.learning.core.day3session1;

import java.util.*;

class Car2 implements Comparable<Car> {
    private String name;
    private double price;

    public Car2(String name, double price) {
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
        return Double.compare(this.price, other.getPrice());
    }
}

public class D03P8_7 {
    public static void main(String[] args) {
        // Creating TreeMap to store Car details
        TreeMap<Double, Car> carMap = new TreeMap<>();

        // Adding predefined Car details
        carMap.put(900000.0, new Car("Benz", 900000.0));
        carMap.put(80050.0, new Car("Bugatti", 80050.0));
        carMap.put(305000.0, new Car("Swift", 305000.0));
        carMap.put(600100.0, new Car("Audi", 600100.0));

        // Retrieving the key-value mapping associated with the greatest price
        Map.Entry<Double, Car> greatestEntry = carMap.lastEntry();
        System.out.println(greatestEntry.getValue());

        // Retrieving the key-value mapping associated with the least price
        Map.Entry<Double, Car> leastEntry = carMap.firstEntry();
        System.out.println(leastEntry.getValue());
    }
}
