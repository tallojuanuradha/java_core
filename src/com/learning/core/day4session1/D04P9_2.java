package com.learning.core.day4session1;

class Node {
    double data;
    Node next;

    Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    Stack() {
        this.top = null;
    }

    void push(double data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    double pop() {
        if (top == null) {
            return Double.NaN; // Or throw an exception indicating stack underflow
        }
        double popped = top.data;
        top = top.next;
        return popped;
    }

    void display() {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class D04P9_2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        double[] elements = {10.0, 20.0, 30.0, 40.0};
        
        // Pushing elements onto the stack
        for (double element : elements) {
            stack.push(element);
        }

        stack.display();

        // Popping twice
        stack.pop();
        stack.pop();

        stack.display();
    }
}
