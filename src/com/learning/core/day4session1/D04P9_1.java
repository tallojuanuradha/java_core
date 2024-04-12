package com.learning.core.day4session1;

public class D04P9_1 {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public D04P9_1(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String item) {
        if (top < maxSize - 1) {
            stackArray[++top] = item;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public String pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack Underflow");
            return null;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        D04P9_1 stack = new D04P9_1(5);

        stack.push("Programming");
        stack.push("java");
        stack.push("world");
        stack.push("Hello");

        System.out.print("After Pushing 4 Elements: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println();
    }
}