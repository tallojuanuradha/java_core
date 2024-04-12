package com.learning.core.day3session1;

import java.util.Hashtable;

 public class Employee{
private int id;
private String name;
private String department;
private String designation;

// Constructor
public Employee(int id, String name, String department, String designation) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.designation = designation;
}

// toString Method
@Override
public String toString() {
    return "Employee{id=" + id + ", name='" + name + '\'' +
           ", department='" + department + '\'' + 
           ", designation='" + designation + '\'' + '}';
}

// equals Method
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Employee)) return false;
    Employee employee = (Employee) o;
    return id == employee.id;
}


@Override
public int hashCode() {
    return Integer.hashCode(id);
}
}
 

public class D03P8_9 {
public static void main(String[] args) {
    Hashtable<Integer, Employee> employees = new Hashtable<>();
    
    
    employees.put(1, new Employee(1, "John Doe", "HR", "Manager"));
    employees.put(2, new Employee(2, "Jane Smith", "IT", "Developer"));
    employees.put(3, new Employee(3, "William Johnson", "Finance", "Analyst"));
    employees.put(4, new Employee(4, "Nancy Brown", "IT", "Designer"));

    
    System.out.println(employees.isEmpty());
}
}