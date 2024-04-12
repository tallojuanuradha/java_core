package com.learning.core.day3session1;

import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    

    @Override
    public String toString() {
        return getName() + " " + getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), car.getName());
    }

    @Override
    public int compareTo(Car other) {
        return this.getName().compareTo(other.getName());
    }



	double getPrice() {
		return price;
	}



	String getName() {
		return name;
	}
	
}

public class D03P8_5 {
    public static void main(String[] args) {
        
        TreeMap<Car, String> carMap = new TreeMap<>();

        
        carMap.put(new Car("Bugatti", 80050.0), "Bugatti");
        carMap.put(new Car("Swift", 305000.0), "Swift");
        carMap.put(new Car("Audi", 600100.0), "Audi");
        carMap.put(new Car("Benz", 900000.0), "BenZ");
        
        for (Car car : carMap.keySet()) {
            System.out.println(car);
        }
    }
}
