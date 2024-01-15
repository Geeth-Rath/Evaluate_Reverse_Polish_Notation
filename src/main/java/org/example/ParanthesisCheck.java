package org.example;

import java.util.Stack;

public class ParanthesisCheck {
    public void checkParanthesis() {
        String s = "(((())))";
        Stack<Character> stack = new Stack();

        for (char i : s.toCharArray()) {
            if (i == '(') {
                stack.add(i);
            } else if (i == ')') {
                if (!stack.isEmpty() && stack.peek() == ('(')) {
                    stack.pop();
                } else {
                    stack.add(i);
                }
            }

        }
        System.out.println(stack);
        if (stack.isEmpty()) {
            System.out.println("blanced");
        } else {
            System.out.println("no");
        }
    }
}
