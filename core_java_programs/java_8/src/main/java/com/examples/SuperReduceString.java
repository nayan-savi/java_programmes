package com.examples;

import java.util.Stack;
import java.util.stream.Collectors;

public class SuperReduceString {
    public static void main(String[] args) {
        String str = "baab";
        String s = superReducedString(str);
        System.out.println(s);

        String s1 = caesarCipher("There's-a-starman-waiting-in-the-sky", 3);
        System.out.println(s1);
    }

    static String superReducedString(String str) {
        Stack<String> characters = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String item = str.charAt(i) + "";
            if (characters.isEmpty()) {
                characters.push(item + "");
            } else {
                String peek = characters.peek();
                if (peek.equals(item)) {
                    characters.pop();
                } else {
                    characters.push(item + "");
                }
            }
        }

        return characters.isEmpty() ? "Empty String" : characters.stream().collect(Collectors.joining());
    }

    static String caesarCipher(String s, int k) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = s.charAt(i);
            if (ascii >= 97 && ascii <= 122) {
                int nextAscii = ascii + k;
                if(nextAscii > 122) {
                    int i1 = 96 + (nextAscii % 122);
                    output += (char) i1;
                } else {
                    output += (char) nextAscii;
                }
            } else if (ascii >= 65 && ascii <= 90) {
                int nextAscii = ascii + k;
                if(nextAscii > 90) {
                    int i1 = 64 + (nextAscii % 90);
                    output += (char) i1;
                } else {
                    output += (char) nextAscii;
                }
            } else {
                output += ch;
            }
        }
        return output;
    }
}
