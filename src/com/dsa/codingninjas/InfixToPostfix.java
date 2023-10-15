package com.dsa.codingninjas;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 15 Oct 2023
 * <p>
 * Infix To Postfix
 * <p>
 * You are given a string exp  which is a valid infix expression.
 * Convert the given infix expression to postfix expression.
 * <p>
 * Infix notation is a method of writing mathematical expressions in which operators are placed between operands.
 * <p>
 * For example, "3 + 4" represents the addition of 3 and 4.
 * <p>
 * Postfix notation is a method of writing mathematical expressions in which operators are placed after the operands.
 * <p>
 * For example, "3 4 +" represents the addition of 3 and 4.
 * <p>
 * Expression contains digits, lower case English letters, ‘(’, ‘)’, ‘+’, ‘-’, ‘*’, ‘/’, ‘^’.
 */
public class InfixToPostfix {
    public static void main(String[] args) {
        String exp = "3^(1+1)";
        System.out.println(infixToPostfix(exp));

    }

    public static String infixToPostfix(String exp) {
        // Initializing empty String for result
        String result = new String("");

        // Initializing empty stack
        Deque<Character> stack
                = new ArrayDeque<Character>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

                // If the scanned character is an '(',
                // push it to the stack.
            else if (c == '(')
                stack.push(c);

                // If the scanned character is an ')',
                // pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty()
                        && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }

                stack.pop();
            }

            // An operator is encountered
            else {
                while (!stack.isEmpty()
                        && Prec(c) <= Prec(stack.peek())) {

                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }

        return result;
    }

    // A utility function to return
    // precedence of a given operator
    // Higher returned value means
    // higher precedence
    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
}



