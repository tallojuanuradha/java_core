package com.learning.core.day3session1;

import java.util.TreeSet;

import java.util.*;

class Person1 implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person1(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.getId() &&
                age == person.getAge() &&
                Double.compare(person.getSalary(), salary) == 0 &&
                Objects.equals(name, person.getName());
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.id, o.getId());
    }
}

public class D03P7_6 {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();

       
        personSet.add(new Person(5, "John", 30, 1999.0));
        personSet.add(new Person(2, "Smith", 35, 2999.0));
        personSet.add(new Person(6, "Tom", 25, 3999.0));
        personSet.add(new Person(1, "Jerry", 28, 999.0));
        personSet.add(new Person(4, "Jones", 40, 6999.0));
        personSet.add(new Person(3, "Popeye", 32, 5999.0));

        
        for (Person person : personSet) {
            System.out.println(person.getId() + " " + person.getName() + " " + person.getSalary());
        }
    }
}