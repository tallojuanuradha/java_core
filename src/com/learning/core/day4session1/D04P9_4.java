package com.learning.core.day4session1;

public class D04P9_4 {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public D04P9_4(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full, cannot enqueue.");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue.");
            return -1; // Or throw an exception
        }
        int dequeuedItem = arr[front];
        front = (front + 1) % capacity;
        size--;
        return dequeuedItem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in queue: ");
        int count = size;
        int i = front;
        while (count > 0) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
            count--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        D04P9_4 queue = new D04P9_4(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        queue.dequeue();

        queue.display();
    }
}
