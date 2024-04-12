package com.learning.core.day3session1;

import java.util.*;

class Person3 implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person3(int id, String name, int age, double salary) {
        this.setId(id);
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and setters

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.getId(), other.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getId() == person.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

public class D03P7_7 {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();

        
        Person person1 = new Person(101, "Jerry", 30, 50000);
        Person person2 = new Person(102, "Smith", 35, 60000);
        Person person3 = new Person(103, "Popeye", 40, 70000);
        Person person4 = new Person(104, "John", 45, 80000);
        Person person5 = new Person(105, "Jones", 50, 90000);
        Person person6 = new Person(106, "Tom", 55, 100000);

       
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

        
        for (Person person : personSet) {
            System.out.print(person.getName().toUpperCase() + " ");
        }
    }
}
