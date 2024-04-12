package com.learning.core.day3session1;

import java.util.Hashtable;

class Employee {
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
        return id + " " + name + " " + department + " " + designation;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee Employee = (Employee) obj;
        return id == Employee.id;
    }
}

public class D03P8_11 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> EmployeeTable = new Hashtable<>();

        // Predefined Employee details
        Employee Employee1 = new Employee(1001, "Daniel", "Analyst", "");
        Employee Employee2 = new Employee(1002, "Thomas", "Tester", "");
        Employee Employee3 = new Employee(1003, "Robert", "Product Manager", "Development");
        Employee Employee4 = new Employee(1004, "Grace", "Tech Support", "HR");

        // Store in HashTable
        EmployeeTable.put(Employee1.hashCode(), Employee1);
        EmployeeTable.put(Employee2.hashCode(), Employee2);
        EmployeeTable.put(Employee3.hashCode(), Employee3);
        EmployeeTable.put(Employee4.hashCode(), Employee4);

        // Adding some Employees if not exists
        addEmployeeIfNotExists(EmployeeTable, new Employee(1005, "Charles", "QA Lead", "Testing"));

        // Print Employee details
        for (Employee Employee : EmployeeTable.values()) {
            System.out.println(Employee);
        }
    }

    private static void addEmployeeIfNotExists(Hashtable<Integer, Employee> EmployeeTable, Employee Employee) {
        if (!EmployeeTable.containsKey(Employee.hashCode())) {
            EmployeeTable.put(Employee.hashCode(), Employee);
        }
    }
}