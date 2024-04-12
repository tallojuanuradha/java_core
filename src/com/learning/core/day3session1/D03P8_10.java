package com.learning.core.day3session1;

import java.util.Hashtable;

public class Employee {
private int id;
private String name;
private String department;
private String designation;

public Employee(int id, String name, String department, String designation) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.designation = designation;
}

@Override
public String toString() {
    return id + " " + name + " " + designation + " " + department;
}

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return id == employee.id;
}

@Override
public int hashCode() {
    return Integer.hashCode(id);
}
}


public class D03P8_10 {
public static void main(String[] args) {
    
    Hashtable<Integer, Employee> employees = new Hashtable<>();

    
    employees.put(1001, new Employee(1001, "John Doe", "HR", "Manager"));
    employees.put(1002, new Employee(1002, "Jane Smith", "IT", "Developer"));
    employees.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
    employees.put(1004, new Employee(1004, "Nancy Brown", "IT", "Designer"));

    
    int employeeIdToSearch = 1003;

   
    if (employees.containsKey(employeeIdToSearch)) {
        Employee employee = employees.get(employeeIdToSearch);
        System.out.println(employee);
    } else {
        System.out.println("Employee with ID " + employeeIdToSearch + " not found.");
    }
}
}
