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
                int sum = 0;
                int x = stack.pop();
                int y = stack.pop();
                System.out.println("x:" + x + " y: " + y);
                switch (s) {
                    case "+":
                        sum = x + y;
                        break;
                    case "-":
                        sum = x - y;
                        break;
                    case "/":
                        sum = x / y;
                        break;
                    case "*":
                        sum = x * y;
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported operator: " + s);
                }
                stack.add(sum);
            }
        }
        System.out.println(stack.peek());
    }

}
