package com.learning.core.day3session1;

import java.util.Objects;
import java.util.TreeSet;

class Person5 implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person5(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and setters

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    public String getName() {
        return name;
    }
}

public class D03P7_9 {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();

        
        Person person1 = new Person(1, "Jerry", 30, 5000);
        Person person2 = new Person(2, "Smith", 35, 6000);
        Person person3 = new Person(3, "Popeye", 40, 7000);
        Person person4 = new Person(4, "Jones", 22, 6999);
        Person person5 = new Person(5, "John", 50, 9000);
        Person person6 = new Person(6, "Tom", 55,10000);
        
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);
     
        for (Person person : personSet) {
            if (person.getName().startsWith("J")) {
                System.out.println(person.toString());
                break;
            }
        }
    }
}
