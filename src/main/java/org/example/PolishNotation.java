package org.example;

import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Pattern;

public class PolishNotation {
    String[] number = new String[]{"2", "1", "+", "3", "*"};
    Stack<Integer> stack = new Stack<>();
    public void getOperation() {
        for (String s : number) {
            if (Pattern.matches("\\d", s)) {
                stack.add(Integer.parseInt(s));
//                System.out.println("sr:" + stack);
            } else {
                int x = stack.pop();
                int y = stack.pop();
                switch (s) {
                    case "+":
                        stack.add(x + y);
                        break;
                    case "-":
                        stack.add(x - y);
                        break;
                    case "/":
                        stack.add(x / y);
                        break;
                    case "*":
                        stack.add(x * y);
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported operator: " + s);
                }
            }
        }
        System.out.println(stack.peek());
    }

}
