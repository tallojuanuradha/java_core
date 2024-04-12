package com.learning.core.day3session1;

import java.util.TreeSet;

class person4 implements Comparable<person4> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public person4(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(person4 o) {
        return Integer.compare(this.id, o.id);
    }
}

public class D03P7_8 {
    public static void main(String[] args) {
        
        TreeSet<person4> persons = new TreeSet<>();

        persons.add(new person4(1, "Jerry", 10, 999.0));
        persons.add(new person4(2, "Smith", 15, 2999.0));
        persons.add(new person4(3, "Popeye", 20, 5999.0));
        persons.add(new person4(4, "Jones", 22, 6999.0));
        persons.add(new person4(5, "John", 32, 1999.0));
        persons.add(new person4(6, "Tom", 42, 3999.0));

        double sum = 0;
        for (person4 person : persons) {
            sum += person.getSalary();
        }

    
        System.out.println("Sum of all salaries: " + sum);
    }
}