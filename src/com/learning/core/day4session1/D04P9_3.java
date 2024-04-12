package com.learning.core.day4session1;

import java.util.Stack;

public class D04P9_3 {
    public static int evaluateExpression(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                operands.push(num);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    process(operands, operators);
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            process(operands, operators);
        }

        return operands.pop();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    private static void process(Stack<Integer> operands, Stack<Character> operators) {
        int operand2 = operands.pop();
        int operand1 = operands.pop();
        char operator = operators.pop();

        switch (operator) {
            case '+':
                operands.push(operand1 + operand2);
                break;
            case '-':
                operands.push(operand1 - operand2);
                break;
            case '*':
                operands.push(operand1 * operand2);
                break;
            case '/':
                operands.push(operand1 / operand2);
                break;
        }
    }

    public static void main(String[] args) {
        String expression = "10+2*6";
        int result = evaluateExpression(expression);
        System.out.println("Output: " + result);
    }
}
