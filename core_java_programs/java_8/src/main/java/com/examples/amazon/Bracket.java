package com.examples.amazon;

import java.util.Stack;

public class Bracket {

    static char openFlower = '{';
    static char closeFlower = '}';

    static char openSquare = '[';
    static char closeSquare = ']';

    static char openBrace = '(';
    static char closeBrace = ')';

    static String isBalanced(String s) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == openBrace || ch == openFlower || ch == openSquare) {
                characters.push(ch);
            } else if(!characters.isEmpty()) {
                char peek = characters.peek();
                char bracket = getBracket(peek);
                if(ch == bracket) {
                    characters.pop();
                } else {
                    characters.push(ch);
                }
            } else {
                characters.push(ch);
            }
        }
        return characters.isEmpty() ? "YES" : "NO";
    }

    static char getBracket(char ch) {
        switch (ch) {
            case '(':
                return ')';
            case '{':
                return '}';
            case '[':
                return ']';
            default:
                return ' ';
        }
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("]"));
    }
}
