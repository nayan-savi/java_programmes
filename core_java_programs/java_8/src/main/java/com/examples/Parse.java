package com.examples;

import java.util.Stack;

public class Parse {

    private char openB ='(';
    private char openF ='{';

    private char closeB =')';
    private char closeF ='}';

    public static void main(String[] args) {
        //System.out.println(new Parse().isBalanced("({)})"));
        System.out.println(new Parse().isBalanced("}{"));
    }
    public boolean isBalanced(String brackets) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            char ch = brackets.charAt(i);
            if(ch == openB || ch == openF) {
                stack.push(ch);
            } else {
                if(!stack.empty()) {
                    Character peek = stack.peek();

                    if (peek == openB && ch == closeB) {
                        stack.pop();
                    } else if (peek == openF && ch == closeF) {
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                } else {
                    stack.push(ch);
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
