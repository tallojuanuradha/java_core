package com.learning.core.day4session1;

class Node1 {
    int data;
    Node next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class D04P9_5 {
    private Node front;
    private Node rear;
    private int size;

    public D04P9_5() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public double dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue.");
            return -1; // Or throw an exception
        }
        double dequeuedItem = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return dequeuedItem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        D04P9_5 queue = new D04P9_5();
        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.display();
    }
}
